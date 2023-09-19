package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.I */
/* loaded from: classes.dex */
public class C0435I extends AbstractC0474v {
    public C0435I(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0474v
    /* renamed from: b */
    protected final int mo601b(C0293m c0293m) {
        int i = 0;
        if (c0293m.m971l0() == null) {
            return 0;
        }
        C0459g m986V = c0293m.m971l0().m986V();
        for (int m984Y = c0293m.m984Y(); m984Y < m986V.size(); m984Y++) {
            if (m986V.get(m984Y).m963t0().equals(c0293m.m963t0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0474v
    /* renamed from: c */
    protected final String mo600c() {
        return atm.m897d("040E12582039190E571A2A751E030A10");
    }
}
