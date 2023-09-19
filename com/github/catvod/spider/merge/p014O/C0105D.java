package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;
import com.github.catvod.spider.merge.p013N.InterfaceC0079d;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.O.D */
/* loaded from: classes.dex */
public final class C0105D {

    /* renamed from: a */
    private final InterfaceC0104C[] f194a;

    /* renamed from: b */
    private final int f195b;

    public C0105D(InterfaceC0104C[] interfaceC0104CArr) {
        this.f194a = interfaceC0104CArr;
        int i = 0;
        for (InterfaceC0104C interfaceC0104C : interfaceC0104CArr) {
            i = C0052e.m1410i(i, interfaceC0104C);
        }
        this.f195b = C0052e.m1415d(i, interfaceC0104CArr.length);
    }

    /* renamed from: a */
    public static C0105D m1300a(C0105D c0105d, InterfaceC0104C interfaceC0104C) {
        if (c0105d == null) {
            return new C0105D(new InterfaceC0104C[]{interfaceC0104C});
        }
        InterfaceC0104C[] interfaceC0104CArr = c0105d.f194a;
        InterfaceC0104C[] interfaceC0104CArr2 = (InterfaceC0104C[]) Arrays.copyOf(interfaceC0104CArr, interfaceC0104CArr.length + 1);
        interfaceC0104CArr2[interfaceC0104CArr2.length - 1] = interfaceC0104C;
        return new C0105D(interfaceC0104CArr2);
    }

    /* renamed from: b */
    public final void m1299b(AbstractC0094s abstractC0094s, InterfaceC0079d interfaceC0079d, int i) {
        InterfaceC0104C[] interfaceC0104CArr;
        int mo1342i = interfaceC0079d.mo1342i();
        boolean z = false;
        try {
            boolean z2 = false;
            for (InterfaceC0104C interfaceC0104C : this.f194a) {
                try {
                    if (interfaceC0104C instanceof C0109H) {
                        int m1296d = ((C0109H) interfaceC0104C).m1296d() + i;
                        interfaceC0079d.mo1344f(m1296d);
                        interfaceC0104C = ((C0109H) interfaceC0104C).m1297c();
                        if (m1296d != mo1342i) {
                            z2 = true;
                        }
                        z2 = false;
                    } else if (interfaceC0104C.mo1295a()) {
                        interfaceC0079d.mo1344f(mo1342i);
                        z2 = false;
                    }
                    interfaceC0104C.mo1294b(abstractC0094s);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC0079d.mo1344f(mo1342i);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC0079d.mo1344f(mo1342i);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    public final C0105D m1298c(int i) {
        InterfaceC0104C[] interfaceC0104CArr = null;
        int i2 = 0;
        while (true) {
            InterfaceC0104C[] interfaceC0104CArr2 = this.f194a;
            if (i2 >= interfaceC0104CArr2.length) {
                break;
            }
            if (interfaceC0104CArr2[i2].mo1295a()) {
                InterfaceC0104C[] interfaceC0104CArr3 = this.f194a;
                if (!(interfaceC0104CArr3[i2] instanceof C0109H)) {
                    if (interfaceC0104CArr == null) {
                        interfaceC0104CArr = (InterfaceC0104C[]) interfaceC0104CArr3.clone();
                    }
                    interfaceC0104CArr[i2] = new C0109H(i, this.f194a[i2]);
                }
            }
            i2++;
        }
        return interfaceC0104CArr == null ? this : new C0105D(interfaceC0104CArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0105D) {
            C0105D c0105d = (C0105D) obj;
            return this.f195b == c0105d.f195b && Arrays.equals(this.f194a, c0105d.f194a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f195b;
    }
}
