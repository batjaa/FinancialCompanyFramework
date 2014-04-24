package framework.report;

import framework.IFunctor;

public abstract class AbstractBillFunctor<T> implements IFunctor<T> {
	private StringBuilder	report	= new StringBuilder();

	public abstract void writeInReport(T customer);

	public void addEmptyLine() {
		report.append("\n");
	}

	public void addLine(String str) {
		report.append(str + "\n");
	}

	public void clear() {
		report = new StringBuilder();
	}

	public String getReport() {
		return report.toString();
	}

}
