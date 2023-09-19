package com.github.catvod.spider.merge.p016Q;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.C0074I;
import com.github.catvod.spider.merge.p013N.InterfaceC0073H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.github.catvod.spider.merge.Q.k */
/* loaded from: classes.dex */
public final class C0189k implements InterfaceC0185g {

    /* renamed from: a */
    protected List<C0188j> f345a;

    /* renamed from: b */
    protected boolean f346b;

    static {
        m1198g(0, 1114111).m1196i();
        new C0189k(new int[0]).m1196i();
    }

    public C0189k(int... iArr) {
        this.f345a = new ArrayList(iArr.length);
        for (int i : iArr) {
            m1204a(i);
        }
    }

    /* renamed from: g */
    public static C0189k m1198g(int i, int i2) {
        C0189k c0189k = new C0189k(new int[0]);
        c0189k.m1203b(i, i2);
        return c0189k;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: k */
    public static C0189k m1194k(C0189k c0189k, C0189k c0189k2) {
        int i = 0;
        if (c0189k.m1199f()) {
            return new C0189k(new int[0]);
        }
        C0189k c0189k3 = new C0189k(new int[0]);
        c0189k3.m1202c(c0189k);
        if (!c0189k2.m1199f()) {
            int i2 = 0;
            while (i < c0189k3.f345a.size() && i2 < c0189k2.f345a.size()) {
                C0188j c0188j = (C0188j) c0189k3.f345a.get(i);
                C0188j c0188j2 = (C0188j) c0189k2.f345a.get(i2);
                int i3 = c0188j2.f344b;
                int i4 = c0188j.f343a;
                if (i3 >= i4) {
                    int i5 = c0188j2.f343a;
                    int i6 = c0188j.f344b;
                    if (i5 <= i6) {
                        C0188j c0188j3 = i5 > i4 ? new C0188j(i4, i5 - 1) : null;
                        C0188j c0188j4 = i3 < i6 ? new C0188j(i3 + 1, i6) : null;
                        ?? r2 = c0189k3.f345a;
                        if (c0188j3 != null) {
                            r2.set(i, c0188j3);
                            if (c0188j4 != null) {
                                i++;
                                c0189k3.f345a.add(i, c0188j4);
                            }
                        } else if (c0188j4 != null) {
                            r2.set(i, c0188j4);
                        } else {
                            r2.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c0189k3;
    }

    /* renamed from: a */
    public final void m1204a(int i) {
        if (this.f346b) {
            throw new IllegalStateException(atm.m897d("091B145238780B160E103E78181F1B11233606035A3C222C0F080C14200B0F0E"));
        }
        m1203b(i, i);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: b */
    public final void m1203b(int i, int i2) {
        C0188j m1206b = C0188j.m1206b(i, i2);
        if (this.f346b) {
            throw new IllegalStateException(atm.m897d("091B145238780B160E103E78181F1B11233606035A3C222C0F080C14200B0F0E"));
        }
        if (m1206b.f344b < m1206b.f343a) {
            return;
        }
        ListIterator listIterator = this.f345a.listIterator();
        while (listIterator.hasNext()) {
            C0188j c0188j = (C0188j) listIterator.next();
            if (m1206b.equals(c0188j)) {
                return;
            }
            boolean z = true;
            if ((m1206b.f343a == c0188j.f344b + 1 || m1206b.f344b == c0188j.f343a - 1) || !m1206b.m1207a(c0188j)) {
                C0188j m1205c = m1206b.m1205c(c0188j);
                listIterator.set(m1205c);
                while (listIterator.hasNext()) {
                    C0188j c0188j2 = (C0188j) listIterator.next();
                    if (!(m1205c.f343a == c0188j2.f344b + 1 || m1205c.f344b == c0188j2.f343a - 1) && m1205c.m1207a(c0188j2)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(m1205c.m1205c(c0188j2));
                    listIterator.next();
                }
                return;
            }
            int i3 = m1206b.f343a;
            int i4 = c0188j.f343a;
            if (i3 >= i4 || m1206b.f344b >= i4) {
                z = false;
                continue;
            }
            if (z) {
                listIterator.previous();
                listIterator.add(m1206b);
                return;
            }
        }
        this.f345a.add(m1206b);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: c */
    public final C0189k m1202c(InterfaceC0185g interfaceC0185g) {
        if (interfaceC0185g == null) {
            return this;
        }
        int i = 0;
        if (interfaceC0185g instanceof C0189k) {
            C0189k c0189k = (C0189k) interfaceC0185g;
            int size = c0189k.f345a.size();
            while (i < size) {
                C0188j c0188j = (C0188j) c0189k.f345a.get(i);
                m1203b(c0188j.f343a, c0188j.f344b);
                i++;
            }
        } else {
            C0189k c0189k2 = (C0189k) interfaceC0185g;
            ArrayList arrayList = new ArrayList();
            int size2 = c0189k2.f345a.size();
            while (i < size2) {
                C0188j c0188j2 = (C0188j) c0189k2.f345a.get(i);
                int i2 = c0188j2.f344b;
                for (int i3 = c0188j2.f343a; i3 <= i2; i3++) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m1204a(((Integer) it.next()).intValue());
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: d */
    public final boolean m1201d(int i) {
        int size = this.f345a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C0188j c0188j = (C0188j) this.f345a.get(i3);
            int i4 = c0188j.f343a;
            if (c0188j.f344b < i) {
                i2 = i3 + 1;
            } else if (i4 <= i) {
                return true;
            } else {
                size = i3 - 1;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: e */
    public final int m1200e() {
        if (m1199f()) {
            throw new RuntimeException(atm.m897d("191F0E55252B4A1F17053821"));
        }
        return ((C0188j) this.f345a.get(0)).f343a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0189k)) {
            return false;
        }
        return this.f345a.equals(((C0189k) obj).f345a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: f */
    public final boolean m1199f() {
        ?? r0 = this.f345a;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: h */
    public final void m1197h() {
        if (this.f346b) {
            throw new IllegalStateException(atm.m897d("091B145238780B160E103E78181F1B11233606035A3C222C0F080C14200B0F0E"));
        }
        int size = this.f345a.size();
        for (int i = 0; i < size; i++) {
            C0188j c0188j = (C0188j) this.f345a.get(i);
            int i2 = c0188j.f343a;
            int i3 = c0188j.f344b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                this.f345a.remove(i);
                return;
            } else if (-2 == i2) {
                c0188j.f343a = i2 + 1;
                return;
            } else if (-2 == i3) {
                c0188j.f344b = i3 - 1;
                return;
            } else {
                if (-2 > i2 && -2 < i3) {
                    c0188j.f344b = -3;
                    m1203b(-1, i3);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    public final int hashCode() {
        Iterator it = this.f345a.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0188j c0188j = (C0188j) it.next();
            i = C0052e.m1411h(C0052e.m1411h(i, c0188j.f343a), c0188j.f344b);
        }
        return C0052e.m1415d(i, this.f345a.size() * 2);
    }

    /* renamed from: i */
    public final void m1196i() {
        boolean z = this.f346b;
        this.f346b = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: j */
    public final int m1195j() {
        int size = this.f345a.size();
        if (size == 1) {
            C0188j c0188j = (C0188j) this.f345a.get(0);
            return (c0188j.f344b - c0188j.f343a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0188j c0188j2 = (C0188j) this.f345a.get(i2);
            i += (c0188j2.f344b - c0188j2.f343a) + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* renamed from: l */
    public final String m1193l(InterfaceC0073H interfaceC0073H) {
        String m1388a;
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.f345a;
        if (r1 == 0 || r1.isEmpty()) {
            return atm.m897d("1107");
        }
        if (m1195j() > 1) {
            sb.append(atm.m897d("11"));
        }
        Iterator it = this.f345a.iterator();
        while (it.hasNext()) {
            C0188j c0188j = (C0188j) it.next();
            int i = c0188j.f343a;
            int i2 = c0188j.f344b;
            String m897d = atm.m897d("465A");
            String m897d2 = atm.m897d("563F2A260514253444");
            String m897d3 = atm.m897d("563F353372");
            if (i == i2) {
                if (i == -1) {
                    m897d2 = m897d3;
                } else if (i != -2) {
                    m897d2 = ((C0074I) interfaceC0073H).m1388a(i);
                }
                sb.append(m897d2);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(m897d);
                    }
                    if (i3 == -1) {
                        m1388a = m897d3;
                    } else {
                        m1388a = i3 == -2 ? m897d2 : ((C0074I) interfaceC0073H).m1388a(i3);
                    }
                    sb.append(m1388a);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(m897d);
            }
        }
        if (m1195j() > 1) {
            sb.append(atm.m897d("17"));
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.Q.j>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.f345a;
        if (r1 == 0 || r1.isEmpty()) {
            return atm.m897d("1107");
        }
        if (m1195j() > 1) {
            sb.append(atm.m897d("11"));
        }
        Iterator it = this.f345a.iterator();
        while (it.hasNext()) {
            C0188j c0188j = (C0188j) it.next();
            int i = c0188j.f343a;
            int i2 = c0188j.f344b;
            if (i != i2) {
                sb.append(i);
                sb.append(atm.m897d("4454"));
                sb.append(i2);
            } else if (i == -1) {
                sb.append(atm.m897d("563F353372"));
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(atm.m897d("465A"));
            }
        }
        if (m1195j() > 1) {
            sb.append(atm.m897d("17"));
        }
        return sb.toString();
    }
}
