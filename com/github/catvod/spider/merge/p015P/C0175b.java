package com.github.catvod.spider.merge.p015P;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p013N.C0074I;
import com.github.catvod.spider.merge.p014O.AbstractC0169v;
import com.github.catvod.spider.merge.p014O.C0137f;
import com.github.catvod.spider.merge.p014O.C0158p0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.P.b */
/* loaded from: classes.dex */
public final class C0175b {

    /* renamed from: a */
    public final Map<C0178e, C0178e> f306a = new HashMap();

    /* renamed from: b */
    public volatile C0178e f307b;

    /* renamed from: c */
    public final int f308c;

    /* renamed from: d */
    public final AbstractC0169v f309d;

    /* renamed from: e */
    private final boolean f310e;

    public C0175b(AbstractC0169v abstractC0169v, int i) {
        this.f309d = abstractC0169v;
        this.f308c = i;
        boolean z = true;
        if ((abstractC0169v instanceof C0158p0) && ((C0158p0) abstractC0169v).f295j) {
            C0178e c0178e = new C0178e(new C0137f(true));
            c0178e.f317c = new C0178e[0];
            c0178e.f318d = false;
            c0178e.f321g = false;
            this.f307b = c0178e;
        } else {
            z = false;
        }
        this.f310e = z;
    }

    /* renamed from: a */
    public final C0178e m1226a(int i) {
        if (this.f310e) {
            if (i < 0 || i >= this.f307b.f317c.length) {
                return null;
            }
            return this.f307b.f317c[i];
        }
        throw new IllegalStateException(atm.m897d("2514160C6C28181F1910283D04191F55081E2B095A182D214A19151B383903145A146C28181F1910283D04191F553F2C0B080E553F2C0B0E1F5B"));
    }

    /* renamed from: b */
    public final boolean m1225b() {
        return this.f310e;
    }

    /* renamed from: c */
    public final void m1224c(int i, C0178e c0178e) {
        if (!this.f310e) {
            throw new IllegalStateException(atm.m897d("2514160C6C28181F1910283D04191F55081E2B095A182D214A19151B383903145A146C28181F1910283D04191F553F2C0B080E553F2C0B0E1F5B"));
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f307b) {
            if (i >= this.f307b.f317c.length) {
                this.f307b.f317c = (C0178e[]) Arrays.copyOf(this.f307b.f317c, i + 1);
            }
            this.f307b.f317c[i] = c0178e;
        }
    }

    public final String toString() {
        return this.f307b == null ? "" : new C0176c(this, C0074I.f114e).toString();
    }
}
