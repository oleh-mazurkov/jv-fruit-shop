package core.basesyntax.service;

import core.basesyntax.service.impl.StorageService;
import java.util.List;
import java.util.Map;

public interface OperateDay {
    void createOperations(List<String> operationalDay, Map<String,
            StorageService> operationStorageMap);
}
