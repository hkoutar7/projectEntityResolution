package com.entityResolution.Dao.Alignment;

import com.entityResolution.Model.*;

import java.util.*;

public interface IDsDataLoader<T extends IDsParent> {
    List<T> chargeEntitiesFromDb();
}
