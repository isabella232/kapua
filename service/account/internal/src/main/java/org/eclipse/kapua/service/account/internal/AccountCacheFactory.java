/*******************************************************************************
 * Copyright (c) 2020, 2021 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.account.internal;

import org.eclipse.kapua.commons.jpa.AbstractNamedEntityCacheFactory;

/**
 * Cache factory for the {@link AccountServiceImpl}
 */
public class AccountCacheFactory extends AbstractNamedEntityCacheFactory {

    private AccountCacheFactory() {
        super("AccountId", "AccountName");
    }

    protected static AccountCacheFactory getInstance() {
        return new AccountCacheFactory();
    }
}
