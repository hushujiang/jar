package com.github.catvod.spider.merge.p016Q;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import java.io.Serializable;

/* renamed from: com.github.catvod.spider.merge.Q.m */
/* loaded from: classes.dex */
public final class C0191m<A, B> implements Serializable {

    /* renamed from: a */
    public final A f348a;

    /* renamed from: b */
    public final B f349b;

    public C0191m(A a, B b) {
        this.f348a = a;
        this.f349b = b;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0191m) {
            C0191m c0191m = (C0191m) obj;
            A a = this.f348a;
            A a2 = c0191m.f348a;
            if (a == null) {
                equals = a2 == null;
            } else {
                equals = a.equals(a2);
            }
            if (equals) {
                B b = this.f349b;
                B b2 = c0191m.f349b;
                if (b == null) {
                    equals2 = b2 == null;
                } else {
                    equals2 = b.equals(b2);
                }
                if (equals2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1410i(C0052e.m1410i(0, this.f348a), this.f349b), 2);
    }

    public final String toString() {
        return String.format(atm.m897d("425F09596C7D1953"), this.f348a, this.f349b);
    }
}
