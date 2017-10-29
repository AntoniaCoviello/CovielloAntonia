/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 22.49.21                        ---
 * ----------------------------------------------------------------
 */
package my.stageraceuiip.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import my.stageraceuiip.constants.StageraceuiipConstants;
import my.stageraceuiip.jalo.Cyclist;
import my.stageraceuiip.jalo.CyclistRanking;
import my.stageraceuiip.jalo.Stage;
import my.stageraceuiip.jalo.StageRace;
import my.stageraceuiip.jalo.StageRanking;

/**
 * Generated class for type <code>StageraceuiipManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStageraceuiipManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Cyclist createCyclist(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( StageraceuiipConstants.TC.CYCLIST );
			return (Cyclist)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Cyclist : "+e.getMessage(), 0 );
		}
	}
	
	public Cyclist createCyclist(final Map attributeValues)
	{
		return createCyclist( getSession().getSessionContext(), attributeValues );
	}
	
	public CyclistRanking createCyclistRanking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( StageraceuiipConstants.TC.CYCLISTRANKING );
			return (CyclistRanking)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CyclistRanking : "+e.getMessage(), 0 );
		}
	}
	
	public CyclistRanking createCyclistRanking(final Map attributeValues)
	{
		return createCyclistRanking( getSession().getSessionContext(), attributeValues );
	}
	
	public Stage createStage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( StageraceuiipConstants.TC.STAGE );
			return (Stage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Stage : "+e.getMessage(), 0 );
		}
	}
	
	public Stage createStage(final Map attributeValues)
	{
		return createStage( getSession().getSessionContext(), attributeValues );
	}
	
	public StageRace createStageRace(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( StageraceuiipConstants.TC.STAGERACE );
			return (StageRace)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating StageRace : "+e.getMessage(), 0 );
		}
	}
	
	public StageRace createStageRace(final Map attributeValues)
	{
		return createStageRace( getSession().getSessionContext(), attributeValues );
	}
	
	public StageRanking createStageRanking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( StageraceuiipConstants.TC.STAGERANKING );
			return (StageRanking)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating StageRanking : "+e.getMessage(), 0 );
		}
	}
	
	public StageRanking createStageRanking(final Map attributeValues)
	{
		return createStageRanking( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return StageraceuiipConstants.EXTENSIONNAME;
	}
	
}
