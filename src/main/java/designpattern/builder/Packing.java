package designpattern.builder;

public class Packing {

	private final String Name;
	private final String Breakfast;
	private final String Lunch;
	private final String Dinner;

	public Packing(Builder builder) {
		this.Name = builder.Name;
		this.Breakfast = builder.Breakfast;
		this.Lunch = builder.Lunch;
		this.Dinner = builder.Dinner;

	}

	static class Builder {

		private String Name;
		private String Breakfast;
		private String Lunch;
		private String Dinner;

		public Builder(String Name) {
			this.Name = Name;

		}

		public Packing build() {
			return new Packing(this);
		}

		public Builder breakfast(String Breakfast) {
			this.Breakfast = Breakfast;
			return this;
		}

		public Builder Lunch(String Lunch) {
			this.Lunch = Lunch;
			return this;

		}

		public Builder Dinner(String Dinner) {
			this.Dinner = Dinner;
			return this;

		}

	}

	@Override
	public String toString() {
		return "Packing [Name=" + Name + ", Breakfast=" + Breakfast + ", Lunch=" + Lunch + ", Dinner=" + Dinner + "]";
	}

}
