package jkind;

public enum SolverOption {
	SMTINTERPOL, Z3, YICES, YICES2, CVC4, CVC5, MATHSAT;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
