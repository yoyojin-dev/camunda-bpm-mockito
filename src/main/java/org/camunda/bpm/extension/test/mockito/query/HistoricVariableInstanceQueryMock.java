package org.camunda.bpm.extension.test.mockito.query;

import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.history.HistoricActivityInstance;
import org.camunda.bpm.engine.history.HistoricActivityInstanceQuery;
import org.camunda.bpm.engine.history.HistoricVariableInstance;
import org.camunda.bpm.engine.history.HistoricVariableInstanceQuery;

/**
 * @author Jan Galinski, Holisticon AG
 */
public class HistoricVariableInstanceQueryMock extends AbstractQueryMock<HistoricVariableInstanceQueryMock, HistoricVariableInstanceQuery, HistoricVariableInstance, HistoryService> {

  public HistoricVariableInstanceQueryMock() {
    super(HistoricVariableInstanceQuery.class, HistoryService.class);
  }

}