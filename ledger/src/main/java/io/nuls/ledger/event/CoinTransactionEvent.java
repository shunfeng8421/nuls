package io.nuls.ledger.event;

import io.nuls.core.chain.entity.NulsData;
import io.nuls.core.chain.entity.Transaction;
import io.nuls.core.event.NulsEvent;
import io.nuls.core.event.NulsEventHeader;
import io.nuls.core.utils.io.ByteBuffer;
import io.nuls.ledger.entity.CoinTransaction;

/**
 * Created by Niels on 2017/11/8.
 *
 */
public abstract class CoinTransactionEvent<T extends CoinTransaction> extends BaseLedgerEvent<T> {

    public CoinTransactionEvent(NulsEventHeader header) {
        super(header);
    }

}