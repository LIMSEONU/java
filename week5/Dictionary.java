package Neww;

public class Dictionary extends PairMap {
	
	Dictionary(int arrlength){
		keyArray = new String[arrlength];
		valueArray = new String[arrlength];
		
		for(int i = 0; i<arrlength;i++) {
			keyArray[i] = "null";
			valueArray[i] = "null";
		}
	}

	@Override
	public String get(String key) {
		// TODO Auto-generated method stub
		String ans = "null";
		for (int i = 0; i<keyArray.length; i++)
			if(keyArray[i].equals(key))
				ans = valueArray[i];
		return ans;
	}

	@Override
	public void put(String key, String value) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<keyArray.length; i++)
			if(keyArray[i].equals(key)) {
				valueArray[i] = value;
				break;
			}
		if(i==keyArray.length) {
			int j;
			for (j = 0; j<keyArray.length; j++)
				if (keyArray[j].equals("null")) {
					keyArray[j] = key;
							valueArray[j]=value;
					break;
				}
			if(j == keyArray.length)
				System.out.println("Dictionary full");
		}
	}
	
	@Override
	public String delete(String key) {
		// TODO Auto-generated method stub
		String st = "null";
		for(int i = 0; i<keyArray.length; i++)
			if(keyArray[i].equals(key)) {
				st = valueArray[i];
				keyArray[i] = "null";
				valueArray[i] = "null";
			}
		return st;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i<keyArray.length; i++) {
			if (keyArray[i].equals(null));
			else
				count++;
		}
		return count;
	}
	
	

}
