package myproject.dashboard.entity;

public enum EducationalStage {
	NONE(""),
	ELEMENTARY("Regular do ensino fundamental ou do 1° grau"),
	HIGH_SCHOOL("Regular do ensino médio ou do 2º grau"),
	GED_ELEMENTARY("Supletivo do ensino fundamental ou do 1º grau"),
	GED_SECONDARY("Supletivo do ensino médio ou do 2º grau"),
	BACHELOR("Superior - graduação"),
	ADULT_LITERACY("Alfabetização de adultos"),
	PRESCHOOL("Pré-escolar"),
	PREPARATORY("Pré-vestibular"),
	POSTGRADUATE("Mestrado ou doutorado");
	
	private String stage;
	
	private EducationalStage(String stage){
		this.stage = stage;
	}
	
	public String getStageText(){
		return this.stage;
	}
}
