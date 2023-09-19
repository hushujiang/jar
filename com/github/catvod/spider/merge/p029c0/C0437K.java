package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.c0.K */
/* loaded from: classes.dex */
public final class C0437K extends AbstractC0440N {
    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        C0293m m971l0 = c0293m2.m971l0();
        if (m971l0 == null || (m971l0 instanceof C0288h)) {
            return false;
        }
        Iterator<C0293m> it = m971l0.m986V().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m963t0().equals(c0293m2.m963t0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return atm.m897d("501514193575051C570135280F");
    }
}
