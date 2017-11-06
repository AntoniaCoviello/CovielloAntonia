/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6-nov-2017 0.33.24                          ---
 * ----------------------------------------------------------------
 */
package my.hospital.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedHospitalConstants
{
	public static final String EXTENSIONNAME = "hospital";
	public static class TC
	{
		public static final String DOCTOR = "Doctor".intern();
		public static final String GENDER1 = "Gender1".intern();
		public static final String INDIVIDUAL1 = "Individual1".intern();
		public static final String PATIENT = "Patient".intern();
		public static final String RESULT = "Result".intern();
		public static final String VISIT = "Visit".intern();
		public static final String WARD = "Ward".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class Gender1
		{
			public static final String MALE = "MALE".intern();
			public static final String FEMALE = "FEMALE".intern();
		}
		public static class Result
		{
			public static final String NEGATIVE = "NEGATIVE".intern();
			public static final String POSITIVE = "POSITIVE".intern();
		}
	}
	public static class Relations
	{
		public static final String DOCTOR2VISITRELATION = "Doctor2VisitRelation".intern();
		public static final String WARD2DOCTORRELATION = "Ward2DoctorRelation".intern();
		public static final String WARD2PATIENTRELATION = "Ward2PatientRelation".intern();
	}
	
	protected GeneratedHospitalConstants()
	{
		// private constructor
	}
	
	
}
