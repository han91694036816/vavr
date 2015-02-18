/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

import javaslang.CheckedFunction1;

/**
 * Checked version of java.util.function.UnaryOperator.
 *
 * @param <T> Operand type
 */
@FunctionalInterface
public interface CheckedUnaryOperator<T> extends CheckedFunction1<T, T> {

    static final long serialVersionUID = 1L;

    static <T> CheckedUnaryOperator<T> identity() {
        return t -> t;
    }
}