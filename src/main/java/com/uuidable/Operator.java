package com.uuidable;

public sealed interface Operator permits EqualsOperator, NotEqualsOperator {
}

record EqualsOperator() implements Operator {

}

record NotEqualsOperator() implements Operator {

}

//
//record LessThanOperator() implements Operator {
//
//}
