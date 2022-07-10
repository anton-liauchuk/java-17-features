package com.uuidable;

public sealed interface Operator permits EqualsOperator, NotEqualsOperator, NonSealedOperator, RecordOperator {
}
