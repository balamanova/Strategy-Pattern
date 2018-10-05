public abstract class University {
	
	protected UniversityHiring universityRule;
	
	public void performHire(){
		universityRule.hire();
	}
	
	public void setBehaviour(UniversityHiring universityRule){
		this.universityRule = universityRule;
	}

}
