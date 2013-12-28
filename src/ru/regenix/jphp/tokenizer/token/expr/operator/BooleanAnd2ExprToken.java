package ru.regenix.jphp.tokenizer.token.expr.operator;

import ru.regenix.jphp.runtime.memory.support.Memory;
import ru.regenix.jphp.tokenizer.TokenType;
import ru.regenix.jphp.tokenizer.TokenMeta;

/**
 * and symbol
 */
public class BooleanAnd2ExprToken extends LogicOperatorExprToken {
    public BooleanAnd2ExprToken(TokenMeta meta) {
        super(meta, TokenType.T_BOOLEAN_AND);
    }

    @Override
    public int getPriority() {
        return 170;
    }

    @Override
    public Memory calc(Memory o1, Memory o2) {
        return o1.toBoolean() && o2.toBoolean() ? Memory.TRUE : Memory.FALSE;
    }
}
