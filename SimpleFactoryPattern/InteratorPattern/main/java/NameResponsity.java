package main.java;

public class NameResponsity implements Container {

	public String names[] = {"Robert", "John", "Julie", "Lora"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}


	public class NameIterator implements Iterator {//ÄÚ²¿Àà

		int index;
	
		@Override
		public Object next() {
			if(this.hasNext())
				return names[index++];
			return null;
		}
		
		@Override
		public boolean hasNext() {
		if(index < names.length)
			return true;
		return false;
		}

	}
}