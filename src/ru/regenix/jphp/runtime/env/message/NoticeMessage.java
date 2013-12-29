package ru.regenix.jphp.runtime.env.message;

import ru.regenix.jphp.common.Messages;
import ru.regenix.jphp.exceptions.support.ErrorType;
import ru.regenix.jphp.runtime.env.CallStackItem;
import ru.regenix.jphp.runtime.env.Environment;

public class NoticeMessage extends SystemMessage {

    public NoticeMessage(CallStackItem trace, Messages.Item message, Object... args) {
        super(trace, message, args);
    }

    public NoticeMessage(Environment environment, Messages.Item message, Object... args) {
        super(environment, message, args);
    }

    @Override
    public ErrorType getType() {
        return ErrorType.E_NOTICE;
    }
}
