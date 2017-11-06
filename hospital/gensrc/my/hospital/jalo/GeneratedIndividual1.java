/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6-nov-2017 0.33.24                          ---
 * ----------------------------------------------------------------
 */
package my.hospital.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospital.constants.HospitalConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Individual1}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIndividual1 extends GenericItem
{
	/** Qualifier of the <code>Individual1.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Individual1.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Individual1.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Individual1.cf</code> attribute **/
	public static final String CF = "cf";
	/** Qualifier of the <code>Individual1.dateofbirth</code> attribute **/
	public static final String DATEOFBIRTH = "dateofbirth";
	/** Qualifier of the <code>Individual1.placeofbirth</code> attribute **/
	public static final String PLACEOFBIRTH = "placeofbirth";
	/** Qualifier of the <code>Individual1.gender</code> attribute **/
	public static final String GENDER = "gender";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(CF, AttributeMode.INITIAL);
		tmp.put(DATEOFBIRTH, AttributeMode.INITIAL);
		tmp.put(PLACEOFBIRTH, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.cf</code> attribute.
	 * @return the cf
	 */
	public String getCf(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.cf</code> attribute.
	 * @return the cf
	 */
	public String getCf()
	{
		return getCf( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.cf</code> attribute. 
	 * @param value the cf
	 */
	public void setCf(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.cf</code> attribute. 
	 * @param value the cf
	 */
	public void setCf(final String value)
	{
		setCf( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.dateofbirth</code> attribute.
	 * @return the dateofbirth
	 */
	public Date getDateofbirth(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.dateofbirth</code> attribute.
	 * @return the dateofbirth
	 */
	public Date getDateofbirth()
	{
		return getDateofbirth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.dateofbirth</code> attribute. 
	 * @param value the dateofbirth
	 */
	public void setDateofbirth(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.dateofbirth</code> attribute. 
	 * @param value the dateofbirth
	 */
	public void setDateofbirth(final Date value)
	{
		setDateofbirth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.placeofbirth</code> attribute.
	 * @return the placeofbirth
	 */
	public String getPlaceofbirth(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLACEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.placeofbirth</code> attribute.
	 * @return the placeofbirth
	 */
	public String getPlaceofbirth()
	{
		return getPlaceofbirth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.placeofbirth</code> attribute. 
	 * @param value the placeofbirth
	 */
	public void setPlaceofbirth(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLACEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.placeofbirth</code> attribute. 
	 * @param value the placeofbirth
	 */
	public void setPlaceofbirth(final String value)
	{
		setPlaceofbirth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual1.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual1.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
