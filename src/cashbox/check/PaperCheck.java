package cashbox.check;

public class PaperCheck implements Check {

	private Double sum;

	@Override
	public Double getSum() {
		return this.sum;
	}

	@Override
	public void setSum(Double sum) {
		this.sum = sum;
	}
}
