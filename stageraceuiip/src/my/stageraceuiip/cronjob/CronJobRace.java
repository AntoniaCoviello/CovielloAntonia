package my.stageraceuiip.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;



public class CronJobRace extends AbstractJobPerformable<CronJobModel>
{
	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{


		//confronto tra la data di creazione dell'ultimo stage ed ultimo cronjob
		//nel caso in cui tale diff fosse maggiore di 0 significherebbe l'aggiunta di un altro stage
		//e quindi il ricalcolo del CyclistRanking con l'aggiornamento dei risultati

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}
}
