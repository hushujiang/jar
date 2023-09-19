package com.github.catvod.spider.merge.p015P;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p014O.C0105D;
import com.github.catvod.spider.merge.p014O.C0137f;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.P.e */
/* loaded from: classes.dex */
public final class C0178e {

    /* renamed from: a */
    public int f315a;

    /* renamed from: b */
    public C0137f f316b;

    /* renamed from: c */
    public C0178e[] f317c;

    /* renamed from: d */
    public boolean f318d;

    /* renamed from: e */
    public int f319e;

    /* renamed from: f */
    public C0105D f320f;

    /* renamed from: g */
    public boolean f321g;

    /* renamed from: h */
    public C0177d[] f322h;

    public C0178e() {
        this.f315a = -1;
        this.f316b = new C0137f(true);
        this.f318d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0178e) {
            return this.f316b.equals(((C0178e) obj).f316b);
        }
        return false;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1411h(7, this.f316b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f315a);
        sb.append(atm.m897d("50"));
        sb.append(this.f316b);
        if (this.f318d) {
            sb.append(atm.m897d("5744"));
            C0177d[] c0177dArr = this.f322h;
            if (c0177dArr != null) {
                sb.append(Arrays.toString(c0177dArr));
            } else {
                sb.append(this.f319e);
            }
        }
        return sb.toString();
    }

    public C0178e(C0137f c0137f) {
        this.f315a = -1;
        new C0137f(true);
        this.f318d = false;
        this.f316b = c0137f;
    }
}
