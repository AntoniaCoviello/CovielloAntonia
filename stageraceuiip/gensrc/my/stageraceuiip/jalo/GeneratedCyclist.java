/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 22.49.21                        ---
 * ----------------------------------------------------------------
 */
package my.stageraceuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.stageraceuiip.constants.StageraceuiipConstants;
import my.stageraceuiip.jalo.StageRanking;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cyclist}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclist extends GenericItem
{
	/** Qualifier of the <code>Cyclist.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Cyclist.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Cyclist.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Cyclist.stagerankings</code> attribute **/
	public static final String STAGERANKINGS = "stagerankings";
	/**
	* {@link OneToManyHandler} for handling 1:n STAGERANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StageRanking> STAGERANKINGSHANDLER = new OneToManyHandler<StageRanking>(
	StageraceuiipConstants.TC.STAGERANKING,
	false,
	"cyclist",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.stagerankings</code> attribute.
	 * @return the stagerankings
	 */
	public Collection<StageRanking> getStagerankings(final SessionContext ctx)
	{
		return STAGERANKINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.stagerankings</code> attribute.
	 * @return the stagerankings
	 */
	public Collection<StageRanking> getStagerankings()
	{
		return getStagerankings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.stagerankings</code> attribute. 
	 * @param value the stagerankings
	 */
	public void setStagerankings(final SessionContext ctx, final Collection<StageRanking> value)
	{
		STAGERANKINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.stagerankings</code> attribute. 
	 * @param value the stagerankings
	 */
	public void setStagerankings(final Collection<StageRanking> value)
	{
		setStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagerankings. 
	 * @param value the item to add to stagerankings
	 */
	public void addToStagerankings(final SessionContext ctx, final StageRanking value)
	{
		STAGERANKINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagerankings. 
	 * @param value the item to add to stagerankings
	 */
	public void addToStagerankings(final StageRanking value)
	{
		addToStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagerankings. 
	 * @param value the item to remove from stagerankings
	 */
	public void removeFromStagerankings(final SessionContext ctx, final StageRanking value)
	{
		STAGERANKINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagerankings. 
	 * @param value the item to remove from stagerankings
	 */
	public void removeFromStagerankings(final StageRanking value)
	{
		removeFromStagerankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
