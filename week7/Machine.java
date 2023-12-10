import java.util.*;

class Instruction {
	private String line;
	private String opcode;
	private String operand [] = new String [2];
	public Instruction(String line) {
		this.line = line;
		line = line.toUpperCase();
		StringTokenizer st = new StringTokenizer(line);

		opcode = st.nextToken();
		operand[0] = st.nextToken();
		operand[1] = st.nextToken();
	}
	
	public String getOpcode() {
		return opcode;
	}
	
	public String getOperand(int index) {
		if(index < 0 || index > 2)
			return null;
		return operand[index];
	}
	
	public String toString() {
		return "[" + line + "] ";
	}
}

public class Machine {
	private String name;
	private HashMap<String, Integer> memory = new HashMap<String, Integer>();
	private Vector<Instruction> program = new Vector<Instruction>();
	private Scanner scanner = new Scanner(System.in);
	
	public Machine(String name) {
		this.name = name;
	}
	
	public void readProgramIntoMemory() {
		while(true) {
			System.out.print(">> ");
			String line = scanner.nextLine();
			if(line.toUpperCase().equals("GO"))
				break;
			program.add(new Instruction(line));
		}
	}
	public void clearMemory() {
		program.removeAllElements();
		memory.clear();
	}
	
	public void error(int pc, String msg) {
		System.out.print("프로그램 라인 " + (pc+1) + "에서 오류. " + msg);
	}
	
	public void execute() {
		int pc=0;
		while(true) {
			Instruction instruction = program.get(pc);
			pc++;
			switch(instruction.getOpcode()) {
				case "MOV" : mov(instruction); break;
				case "ADD" : add(instruction); break;				
				case "SUB" : sub(instruction); break;
				case "JN0" : 
					int newAddr = jn0(instruction);
					if(newAddr == -1)
						break;
					else {
						pc = newAddr;
						break;
					}				
				case "PRT" : prt(instruction); return;
				default : 	error(instruction); return;
			}

		}
	}
	
	private void error(Instruction instruction) {
		System.out.print("명령 오류! ");
		printVariables(instruction);
	}
	
	private void printVariables(Instruction instruction) {
		System.out.print(instruction+"\n");
		
		Set<String> s = memory.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String variable = it.next();
			int value = memory.get(variable);
			System.out.print(variable + ":" + value + "\t");
		}
		System.out.println();
	}
	
	private void prt(Instruction instruction) {
		String first = instruction.getOperand(0);
		
		int n = getValue(first);
		printVariables(instruction); 
		System.out.println("출력할 결과는 " + n + ". 프로그램 실행 끝");
	}

	private int jn0(Instruction instruction) {
		String first = instruction.getOperand(0);
		String second = instruction.getOperand(1);
		
		int n = getValue(first);
		int m = getValue(second);
		if(n != 0) {
			return m;
		}
		else
			return -1;
	}
	
	private void sub(Instruction instruction) {
		String first = instruction.getOperand(0);
		String second = instruction.getOperand(1);
		
		int n = getValue(first);
		int m = getValue(second);
		memory.put(first, n-m);
	}

	private void add(Instruction instruction) {
		String first = instruction.getOperand(0);
		String second = instruction.getOperand(1);
		
		int n = getValue(first);
		int m = getValue(second);
		memory.put(first, n+m);
	}
	
	private void mov(Instruction instruction) {
		String variable = instruction.getOperand(0);
		String second = instruction.getOperand(1);
		
		int n = getValue(second);
		memory.put(variable, n);
	}
	
	private int getValue(String opr) {
		int n;
		try {
			n = Integer.parseInt(opr);
		}
		catch(NumberFormatException e) {
			Integer value = memory.get(opr);
			if(value == null) {
				memory.put(opr, 0);
				n = 0;
			}
			else {
				n = value;
			}
		}
		return n;
	}

	public void run() {
		System.out.println(name + "이 작동합니다. 프로그램을 입력해주세요. GO를 입력하면 작동합니다.");
		while(true) {
			readProgramIntoMemory();
			execute();
			clearMemory();
		}
	}
	
	public static void main(String[] args) {
		Machine m = new Machine("수퍼컴");
		m.run();
	}
}