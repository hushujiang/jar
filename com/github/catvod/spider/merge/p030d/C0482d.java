package com.github.catvod.spider.merge.p030d;

import com.github.catvod.spider.merge.atm;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.d.d */
/* loaded from: classes.dex */
public final class C0482d implements Comparator<C0481c> {

    /* renamed from: a */
    private final String f910a;

    /* renamed from: b */
    private final String f911b;

    public C0482d(String str, String str2) {
        this.f910a = str;
        this.f911b = str2;
    }

    /* renamed from: a */
    public static void m576a(String str, String str2, List<C0481c> list) {
        Collections.sort(list, new C0482d(str, str2));
    }

    @Override // java.util.Comparator
    public final int compare(C0481c c0481c, C0481c c0481c2) {
        char c;
        int compareTo;
        long m584e;
        long m584e2;
        C0481c c0481c3 = c0481c;
        C0481c c0481c4 = c0481c2;
        boolean equals = this.f911b.equals(atm.m897d("0B0919"));
        String str = this.f910a;
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode == 3076014) {
            if (str.equals(atm.m897d("0E1B0E10"))) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3373707) {
            if (hashCode == 3530753 && str.equals(atm.m897d("19130010"))) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(atm.m897d("041B1710"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            compareTo = equals ? c0481c3.m587b().compareTo(c0481c4.m587b()) : c0481c4.m587b().compareTo(c0481c3.m587b());
        } else if (c != 1) {
            if (c != 2) {
                return -1;
            }
            if (equals) {
                m584e = c0481c3.m584e();
                m584e2 = c0481c4.m584e();
            } else {
                m584e = c0481c4.m584e();
                m584e2 = c0481c3.m584e();
            }
            return (m584e > m584e2 ? 1 : (m584e == m584e2 ? 0 : -1));
        } else {
            compareTo = equals ? c0481c3.m586c().compareTo(c0481c4.m586c()) : c0481c4.m586c().compareTo(c0481c3.m586c());
        }
        return compareTo;
    }
}
