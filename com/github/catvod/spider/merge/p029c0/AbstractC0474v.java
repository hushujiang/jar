package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0288h;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.v */
/* loaded from: classes.dex */
public abstract class AbstractC0474v extends AbstractC0440N {

    /* renamed from: a */
    protected final int f892a;

    /* renamed from: b */
    protected final int f893b;

    public AbstractC0474v(int i, int i2) {
        this.f892a = i;
        this.f893b = i2;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        C0293m m971l0 = c0293m2.m971l0();
        if (m971l0 != null && !(m971l0 instanceof C0288h)) {
            int mo601b = mo601b(c0293m2);
            int i = this.f892a;
            if (i == 0) {
                return mo601b == this.f893b;
            }
            int i2 = mo601b - this.f893b;
            if (i2 * i >= 0 && i2 % i == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    protected abstract int mo601b(C0293m c0293m);

    /* renamed from: c */
    protected abstract String mo600c();

    public String toString() {
        return this.f892a == 0 ? String.format(atm.m897d("505F095D693C43"), mo600c(), Integer.valueOf(this.f893b)) : this.f893b == 0 ? String.format(atm.m897d("505F095D693C0453"), mo600c(), Integer.valueOf(this.f892a)) : String.format(atm.m897d("505F095D693C045F511165"), mo600c(), Integer.valueOf(this.f892a), Integer.valueOf(this.f893b));
    }
}
