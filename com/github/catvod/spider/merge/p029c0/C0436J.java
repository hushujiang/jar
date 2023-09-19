package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.c0.J */
/* loaded from: classes.dex */
public class C0436J extends AbstractC0474v {
    public C0436J(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0474v
    /* renamed from: b */
    protected final int mo601b(C0293m c0293m) {
        int i = 0;
        if (c0293m.m971l0() == null) {
            return 0;
        }
        Iterator<C0293m> it = c0293m.m971l0().m986V().iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            if (next.m963t0().equals(c0293m.m963t0())) {
                i++;
                continue;
            }
            if (next == c0293m) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0474v
    /* renamed from: c */
    protected final String mo600c() {
        return atm.m897d("040E1258233E470E030529");
    }
}
