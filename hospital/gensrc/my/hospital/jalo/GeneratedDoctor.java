/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6-nov-2017 0.33.24                          ---
 * ----------------------------------------------------------------
 */
package my.hospital.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.hospital.constants.HospitalConstants;
import my.hospital.jalo.Individual1;
import my.hospital.jalo.Visit;
import my.hospital.jalo.Ward;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Doctor}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDoctor extends Individual1
{
	/** Qualifier of the <code>Doctor.registrationNumber</code> attribute **/
	public static final String REGISTRATIONNUMBER = "registrationNumber";
	/** Qualifier of the <code>Doctor.ward</code> attribute **/
	public static final String WARD = "ward";
	/** Qualifier of the <code>Doctor.visites</code> attribute **/
	public static final String VISITES = "visites";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n WARD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDoctor> WARDHANDLER = new BidirectionalOneToManyHandler<GeneratedDoctor>(
	HospitalConstants.TC.DOCTOR,
	false,
	"ward",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n VISITES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Visit> VISITESHANDLER = new OneToManyHandler<Visit>(
	HospitalConstants.TC.VISIT,
	false,
	"doctor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Individual1.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REGISTRATIONNUMBER, AttributeMode.INITIAL);
		tmp.put(WARD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		WARDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.registrationNumber</code> attribute.
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGISTRATIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.registrationNumber</code> attribute.
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber()
	{
		return getRegistrationNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.registrationNumber</code> attribute. 
	 * @param value the registrationNumber
	 */
	public void setRegistrationNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGISTRATIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.registrationNumber</code> attribute. 
	 * @param value the registrationNumber
	 */
	public void setRegistrationNumber(final String value)
	{
		setRegistrationNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.visites</code> attribute.
	 * @return the visites
	 */
	public Collection<Visit> getVisites(final SessionContext ctx)
	{
		return VISITESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.visites</code> attribute.
	 * @return the visites
	 */
	public Collection<Visit> getVisites()
	{
		return getVisites( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.visites</code> attribute. 
	 * @param value the visites
	 */
	public void setVisites(final SessionContext ctx, final Collection<Visit> value)
	{
		VISITESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.visites</code> attribute. 
	 * @param value the visites
	 */
	public void setVisites(final Collection<Visit> value)
	{
		setVisites( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visites. 
	 * @param value the item to add to visites
	 */
	public void addToVisites(final SessionContext ctx, final Visit value)
	{
		VISITESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visites. 
	 * @param value the item to add to visites
	 */
	public void addToVisites(final Visit value)
	{
		addToVisites( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visites. 
	 * @param value the item to remove from visites
	 */
	public void removeFromVisites(final SessionContext ctx, final Visit value)
	{
		VISITESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visites. 
	 * @param value the item to remove from visites
	 */
	public void removeFromVisites(final Visit value)
	{
		removeFromVisites( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.ward</code> attribute.
	 * @return the ward
	 */
	public Ward getWard(final SessionContext ctx)
	{
		return (Ward)getProperty( ctx, WARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.ward</code> attribute.
	 * @return the ward
	 */
	public Ward getWard()
	{
		return getWard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.ward</code> attribute. 
	 * @param value the ward
	 */
	public void setWard(final SessionContext ctx, final Ward value)
	{
		WARDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.ward</code> attribute. 
	 * @param value the ward
	 */
	public void setWard(final Ward value)
	{
		setWard( getSession().getSessionContext(), value );
	}
	
}
