package pack_0208;

public class ArrayedGeneralBook implements GeneralBook {
	private String[] names;
	private String[] records;
	
	public ArrayedGeneralBook(String[] names, String[] records) {
		this.names = names;
		this.records = records;
	}
	
	@Override
	public int size(String[] names) {
		// TODO Auto-generated method stub
		return this.names.length;
	}

	@Override
	public String names() {
		// TODO Auto-generated method stub
		String name = "";
		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
			name = name+names[i]+" ";
		}
//		name.concat(names[names.length-1]);
//		System.out.println(name);
		return name;
	}

	@Override
	public String records() {
		// TODO Auto-generated method stub
		String record = "";
		for(int i=0;i<records.length;i++)
			record = record+records[i]+" ";
//		record.concat(records[records.length-1]);
//		System.out.println(record);
		return record;
	}

	@Override
	public boolean nameExist(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<names.length;i++) {
			if(name.equals(names[i]))
				return true;
		}
		return false;
	}

	@Override
	public void add(String name, String record) {
		// TODO Auto-generated method stub
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(name) && records[i].equals(record)) {
				System.out.println("중복된 이름이 있습니다.");
				return;
			}
		}
		String[] nTmp = new String[names.length+1];
		String[] rTmp = new String[records.length+1];
		for(int i=0;i<names.length;i++) {
			nTmp[i] = names[i];
			rTmp[i] = records[i];
		}
		nTmp[names.length] = name;
		rTmp[records.length] = record;
		names = nTmp;
		records = rTmp;
		this.sort();
	}

	@Override
	public void remove(String name, String record) {
		// TODO Auto-generated method stub
		// 아래 방법은 record 가 중복되지 않을 때 사용
		String nTmp = this.names();
		String rTmp = this.records();
		if(nTmp.contains(name) && rTmp.contains(record)) {
			nTmp = nTmp.replace(name+" ", "");
			rTmp = rTmp.replace(record+" ", "");
//			System.out.println(nTmp);
			String[] nsTmp = nTmp.split(" ");
			String[] rsTmp = rTmp.split(" ");
			names = nsTmp;
			records = rsTmp;
		}
		else {
			System.out.println("삭제불가");
			return;
		}
	}

	@Override
	public String get(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<names.length;i++)
			if(names[i].equals(name)) return records[i];
		return null;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].compareTo(names[j])>0) {
					String tmp = names[i];
					names[i] = names[j];
					names[j] = tmp;
					tmp = records[i];
					records[i] = records[j];
					records[j] = tmp;
				}
			}
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		this.sort();
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+records[i]);
		}
	}

}
