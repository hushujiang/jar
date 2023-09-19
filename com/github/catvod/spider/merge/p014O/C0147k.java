package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0189k;
import com.github.catvod.spider.merge.p016Q.C0191m;
import com.github.catvod.spider.merge.p056r.C0653a;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.github.catvod.spider.merge.O.k */
/* loaded from: classes.dex */
public final class C0147k {

    /* renamed from: b */
    private static final UUID f268b;

    /* renamed from: c */
    private static final UUID f269c;

    /* renamed from: d */
    private static final UUID f270d;

    /* renamed from: e */
    private static final List<UUID> f271e;

    /* renamed from: f */
    public static final UUID f272f;

    /* renamed from: a */
    private final C0139g f273a = C0139g.m1259a();

    static {
        UUID fromString = UUID.fromString(atm.m897d("59494D437D1A583E5742741A28574E34786B474238450E755E3C4F37091D523B3B360A6B"));
        UUID fromString2 = UUID.fromString(atm.m897d("5B3E3B450F6D5D3E57430F685C574E467419474338477B755B4A38360E6B293F4A337A69"));
        f268b = fromString2;
        UUID fromString3 = UUID.fromString(atm.m897d("2B3B3E37741C5D3F5734091D2C574E417D6D473B3E470E7552484A41086E293C4A417E1D"));
        f269c = fromString3;
        UUID fromString4 = UUID.fromString(atm.m897d("5F434C477B6F524E57460E1D5F574E447B19473843300E75524B49440D6F58424C457461"));
        f270d = fromString4;
        ArrayList arrayList = new ArrayList();
        f271e = arrayList;
        arrayList.add(fromString);
        arrayList.add(fromString2);
        arrayList.add(fromString3);
        arrayList.add(fromString4);
        f272f = fromString4;
    }

    /* renamed from: c */
    private int m1255c(char[] cArr, int i, List<C0189k> list, InterfaceC0145j interfaceC0145j) {
        int i2 = i + 1;
        char c = cArr[i];
        for (int i3 = 0; i3 < c; i3++) {
            char c2 = cArr[i2];
            int i4 = i2 + 1;
            C0189k c0189k = new C0189k(new int[0]);
            list.add(c0189k);
            int i5 = i4 + 1;
            if (cArr[i4] != 0) {
                c0189k.m1204a(-1);
            }
            i2 = i5;
            for (int i6 = 0; i6 < c2; i6++) {
                int mo1258a = interfaceC0145j.mo1258a(cArr, i2);
                int size = i2 + interfaceC0145j.size();
                int mo1258a2 = interfaceC0145j.mo1258a(cArr, size);
                i2 = size + interfaceC0145j.size();
                c0189k.m1203b(mo1258a, mo1258a2);
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.util.UUID>, java.util.ArrayList] */
    /* renamed from: d */
    protected static boolean m1254d(UUID uuid, UUID uuid2) {
        ?? r0 = f271e;
        int indexOf = r0.indexOf(uuid);
        return indexOf >= 0 && r0.indexOf(uuid2) >= indexOf;
    }

    /* renamed from: e */
    protected static long m1253e(char[] cArr, int i) {
        int i2 = i + 2;
        return (((cArr[i2 + 1] << 16) | cArr[i2]) << 32) | ((cArr[i] | (cArr[i + 1] << 16)) & 4294967295L);
    }

    /* renamed from: a */
    protected final void m1257a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.List<com.github.catvod.spider.merge.O.t0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List<com.github.catvod.spider.merge.O.v>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List<java.util.UUID>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List<com.github.catvod.spider.merge.O.r0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: b */
    public final C0127a m1256b(char[] cArr) {
        InterfaceC0104C c0107f;
        AbstractC0166t0 c0171x;
        AbstractC0151m abstractC0151m;
        AbstractC0151m c0163s;
        char[] cArr2 = (char[]) cArr.clone();
        for (int i = 1; i < cArr2.length; i++) {
            cArr2[i] = (char) (cArr2[i] - 2);
        }
        char c = cArr2[0];
        if (c == 3) {
            UUID uuid = new UUID(m1253e(cArr2, 5), m1253e(cArr2, 1));
            if (f271e.contains(uuid)) {
                boolean m1254d = m1254d(f268b, uuid);
                boolean m1254d2 = m1254d(f269c, uuid);
                C0127a c0127a = new C0127a(C0653a.m138b(2)[cArr2[9]], cArr2[10]);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                char c2 = cArr2[11];
                char c3 = '\f';
                int i2 = 0;
                int i3 = 12;
                while (i2 < c2) {
                    int i4 = i3 + 1;
                    char c4 = cArr2[i3];
                    if (c4 == 0) {
                        c0127a.m1272a(null);
                        i3 = i4;
                    } else {
                        int i5 = i4 + 1;
                        char c5 = cArr2[i4];
                        if (c5 == 65535) {
                            c5 = 65535;
                        }
                        switch (c4) {
                            case 0:
                                abstractC0151m = null;
                                break;
                            case 1:
                                c0163s = new C0163s();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case 2:
                                c0163s = new C0134d0();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case 3:
                                c0163s = new C0161r();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case 4:
                                c0163s = new C0120T();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case 5:
                                c0163s = new C0156o0();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case 6:
                                c0163s = new C0162r0();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case 7:
                                c0163s = new C0136e0();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case '\b':
                                c0163s = new C0165t();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case '\t':
                                c0163s = new C0160q0();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case '\n':
                                c0163s = new C0158p0();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case 11:
                                c0163s = new C0121U();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            case '\f':
                                c0163s = new C0116O();
                                c0163s.f283c = c5;
                                abstractC0151m = c0163s;
                                break;
                            default:
                                throw new IllegalArgumentException(String.format(Locale.getDefault(), atm.m897d("3E121F553F280F191313253D0E5A09012D2C0F5A0E0C3C3D4A5F1E55252B4A1415016C2E0B16131162"), Integer.valueOf(c4)));
                        }
                        if (c4 == c3) {
                            arrayList.add(new C0191m((C0116O) abstractC0151m, Integer.valueOf(cArr2[i5])));
                            i5++;
                        } else if (abstractC0151m instanceof AbstractC0167u) {
                            arrayList2.add(new C0191m((AbstractC0167u) abstractC0151m, Integer.valueOf(cArr2[i5])));
                            i5++;
                        }
                        c0127a.m1272a(abstractC0151m);
                        i3 = i5;
                    }
                    i2++;
                    c3 = '\f';
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0191m c0191m = (C0191m) it.next();
                    ((C0116O) c0191m.f348a).f216g = (AbstractC0151m) c0127a.f234a.get(((Integer) c0191m.f349b).intValue());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C0191m c0191m2 = (C0191m) it2.next();
                    ((AbstractC0167u) c0191m2.f348a).f299i = (C0165t) c0127a.f234a.get(((Integer) c0191m2.f349b).intValue());
                }
                int i6 = i3 + 1;
                char c6 = cArr2[i3];
                int i7 = 0;
                while (i7 < c6) {
                    ((AbstractC0169v) c0127a.f234a.get(cArr2[i6])).f301h = true;
                    i7++;
                    i6++;
                }
                if (m1254d) {
                    int i8 = i6 + 1;
                    char c7 = cArr2[i6];
                    int i9 = 0;
                    while (i9 < c7) {
                        ((C0134d0) c0127a.f234a.get(cArr2[i8])).f252h = true;
                        i9++;
                        i8++;
                    }
                    i6 = i8;
                }
                int i10 = i6 + 1;
                char c8 = cArr2[i6];
                if (c0127a.f238e == 1) {
                    c0127a.f240g = new int[c8];
                }
                c0127a.f236c = new C0134d0[c8];
                for (int i11 = 0; i11 < c8; i11++) {
                    int i12 = i10 + 1;
                    c0127a.f236c[i11] = (C0134d0) c0127a.f234a.get(cArr2[i10]);
                    if (c0127a.f238e == 1) {
                        i10 = i12 + 1;
                        char c9 = cArr2[i12];
                        if (c9 == 65535) {
                            c9 = 65535;
                        }
                        c0127a.f240g[i11] = c9;
                        if (!m1254d(f269c, uuid)) {
                            i12 = i10 + 1;
                            char c10 = cArr2[i10];
                        }
                    }
                    i10 = i12;
                }
                c0127a.f237d = new C0136e0[c8];
                Iterator it3 = c0127a.f234a.iterator();
                while (it3.hasNext()) {
                    AbstractC0151m abstractC0151m2 = (AbstractC0151m) it3.next();
                    if (abstractC0151m2 instanceof C0136e0) {
                        C0136e0 c0136e0 = (C0136e0) abstractC0151m2;
                        C0136e0[] c0136e0Arr = c0127a.f237d;
                        int i13 = abstractC0151m2.f283c;
                        c0136e0Arr[i13] = c0136e0;
                        c0127a.f236c[i13].f251g = c0136e0;
                    }
                }
                int i14 = i10 + 1;
                char c11 = cArr2[i10];
                int i15 = 0;
                while (i15 < c11) {
                    c0127a.f242i.add((C0162r0) c0127a.f234a.get(cArr2[i14]));
                    i15++;
                    i14++;
                }
                ArrayList arrayList3 = new ArrayList();
                int m1255c = m1255c(cArr2, i14, arrayList3, new C0141h());
                if (m1254d(f270d, uuid)) {
                    m1255c = m1255c(cArr2, m1255c, arrayList3, new C0143i());
                }
                int i16 = m1255c + 1;
                char c12 = cArr2[m1255c];
                for (int i17 = 0; i17 < c12; i17++) {
                    char c13 = cArr2[i16];
                    char c14 = cArr2[i16 + 1];
                    char c15 = cArr2[i16 + 2];
                    char c16 = cArr2[i16 + 3];
                    char c17 = cArr2[i16 + 4];
                    char c18 = cArr2[i16 + 5];
                    AbstractC0151m abstractC0151m3 = (AbstractC0151m) c0127a.f234a.get(c14);
                    switch (c15) {
                        case 1:
                            c0171x = new C0171x(abstractC0151m3);
                            continue;
                            ((AbstractC0151m) c0127a.f234a.get(c13)).m1245a(c0171x);
                            i16 += 6;
                        case 2:
                            if (c18 != 0) {
                                c0171x = new C0132c0(abstractC0151m3, -1, c17);
                                continue;
                            } else {
                                c0171x = new C0132c0(abstractC0151m3, c16, c17);
                            }
                            ((AbstractC0151m) c0127a.f234a.get(c13)).m1245a(c0171x);
                            i16 += 6;
                        case 3:
                            c0171x = new C0138f0((C0134d0) c0127a.f234a.get(c16), c18, abstractC0151m3);
                            break;
                        case 4:
                            c0171x = new C0123W(abstractC0151m3, c16, c17, c18 != 0);
                            break;
                        case 5:
                            if (c18 != 0) {
                                c0171x = new C0159q(abstractC0151m3, -1);
                                break;
                            } else {
                                c0171x = new C0159q(abstractC0151m3, c16);
                                break;
                            }
                        case 6:
                            c0171x = new C0155o(abstractC0151m3, c16, c17);
                            break;
                        case 7:
                            c0171x = new C0152m0(abstractC0151m3, (C0189k) arrayList3.get(c16));
                            break;
                        case '\b':
                            c0171x = new C0117P(abstractC0151m3, (C0189k) arrayList3.get(c16));
                            break;
                        case '\t':
                            c0171x = new C0168u0(abstractC0151m3);
                            break;
                        case '\n':
                            c0171x = new C0122V(abstractC0151m3, c16);
                            break;
                        default:
                            throw new IllegalArgumentException(atm.m897d("3E121F553F280F191313253D0E5A0E072D3619130E1C23364A0E0305297803095A1B232C4A0C1B19253C44"));
                    }
                    ((AbstractC0151m) c0127a.f234a.get(c13)).m1245a(c0171x);
                    i16 += 6;
                }
                Iterator it4 = c0127a.f234a.iterator();
                while (it4.hasNext()) {
                    AbstractC0151m abstractC0151m4 = (AbstractC0151m) it4.next();
                    for (int i18 = 0; i18 < abstractC0151m4.m1244b(); i18++) {
                        AbstractC0166t0 m1243d = abstractC0151m4.m1243d(i18);
                        if (m1243d instanceof C0138f0) {
                            C0138f0 c0138f0 = (C0138f0) m1243d;
                            c0127a.f237d[c0138f0.f298a.f283c].m1245a(new C0171x(c0138f0.f263c, (c0127a.f236c[c0138f0.f298a.f283c].f252h && c0138f0.f262b == 0) ? -1 : -1));
                        }
                    }
                }
                Iterator it5 = c0127a.f234a.iterator();
                while (it5.hasNext()) {
                    AbstractC0151m abstractC0151m5 = (AbstractC0151m) it5.next();
                    if (abstractC0151m5 instanceof AbstractC0167u) {
                        AbstractC0167u abstractC0167u = (AbstractC0167u) abstractC0151m5;
                        C0165t c0165t = abstractC0167u.f299i;
                        if (c0165t == null) {
                            throw new IllegalStateException();
                        }
                        if (c0165t.f297g != null) {
                            throw new IllegalStateException();
                        }
                        c0165t.f297g = abstractC0167u;
                    }
                    if (abstractC0151m5 instanceof C0121U) {
                        C0121U c0121u = (C0121U) abstractC0151m5;
                        for (int i19 = 0; i19 < c0121u.m1244b(); i19++) {
                            AbstractC0151m abstractC0151m6 = c0121u.m1243d(i19).f298a;
                            if (abstractC0151m6 instanceof C0120T) {
                                ((C0120T) abstractC0151m6).f225j = c0121u;
                            }
                        }
                    } else if (abstractC0151m5 instanceof C0160q0) {
                        C0160q0 c0160q0 = (C0160q0) abstractC0151m5;
                        for (int i20 = 0; i20 < c0160q0.m1244b(); i20++) {
                            AbstractC0151m abstractC0151m7 = c0160q0.m1243d(i20).f298a;
                            if (abstractC0151m7 instanceof C0158p0) {
                                ((C0158p0) abstractC0151m7).f294i = c0160q0;
                            }
                        }
                    }
                }
                int i21 = i16 + 1;
                char c19 = cArr2[i16];
                int i22 = 1;
                while (i22 <= c19) {
                    int i23 = i21 + 1;
                    AbstractC0169v abstractC0169v = (AbstractC0169v) c0127a.f234a.get(cArr2[i21]);
                    c0127a.f235b.add(abstractC0169v);
                    abstractC0169v.f300g = i22 - 1;
                    i22++;
                    i21 = i23;
                }
                if (c0127a.f238e == 1) {
                    if (m1254d2) {
                        int i24 = i21 + 1;
                        c0127a.f241h = new InterfaceC0104C[cArr2[i21]];
                        int i25 = 0;
                        while (i25 < c0127a.f241h.length) {
                            int i26 = i24 + 1;
                            EnumC0106E enumC0106E = EnumC0106E.values()[cArr2[i24]];
                            int i27 = i26 + 1;
                            char c20 = cArr2[i26];
                            if (c20 == 65535) {
                                c20 = 65535;
                            }
                            int i28 = i27 + 1;
                            char c21 = cArr2[i27];
                            if (c21 == 65535) {
                                c21 = 65535;
                            }
                            switch (enumC0106E.ordinal()) {
                                case 0:
                                    c0107f = new C0107F(c20);
                                    break;
                                case 1:
                                    c0107f = new C0108G(c20, c21);
                                    break;
                                case 2:
                                    c0107f = new C0110I(c20);
                                    break;
                                case 3:
                                    c0107f = C0111J.f211a;
                                    break;
                                case 4:
                                    c0107f = C0112K.f212a;
                                    break;
                                case 5:
                                    c0107f = new C0113L(c20);
                                    break;
                                case 6:
                                    c0107f = C0114M.f214a;
                                    break;
                                case 7:
                                    c0107f = new C0115N(c20);
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.format(Locale.getDefault(), atm.m897d("3E121F553F280F191313253D0E5A1610343D185A1B16383105145A0135280F5A5F116C31195A141A38781C1B161C2876"), enumC0106E));
                            }
                            c0127a.f241h[i25] = c0107f;
                            i25++;
                            i24 = i28;
                        }
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it6 = c0127a.f234a.iterator();
                        while (it6.hasNext()) {
                            AbstractC0151m abstractC0151m8 = (AbstractC0151m) it6.next();
                            for (int i29 = 0; i29 < abstractC0151m8.m1244b(); i29++) {
                                AbstractC0166t0 m1243d2 = abstractC0151m8.m1243d(i29);
                                if (m1243d2 instanceof C0155o) {
                                    C0155o c0155o = (C0155o) m1243d2;
                                    int i30 = c0155o.f290b;
                                    C0108G c0108g = new C0108G(i30, c0155o.f291c);
                                    abstractC0151m8.f285e.set(i29, new C0155o(m1243d2.f298a, i30, arrayList4.size()));
                                    arrayList4.add(c0108g);
                                }
                            }
                        }
                        c0127a.f241h = (InterfaceC0104C[]) arrayList4.toArray(new InterfaceC0104C[arrayList4.size()]);
                    }
                }
                Iterator it7 = c0127a.f234a.iterator();
                while (it7.hasNext()) {
                    AbstractC0151m abstractC0151m9 = (AbstractC0151m) it7.next();
                    if ((abstractC0151m9 instanceof C0158p0) && c0127a.f236c[abstractC0151m9.f283c].f252h) {
                        AbstractC0151m abstractC0151m10 = abstractC0151m9.m1243d(abstractC0151m9.m1244b() - 1).f298a;
                        if ((abstractC0151m10 instanceof C0116O) && abstractC0151m10.f284d && (abstractC0151m10.m1243d(0).f298a instanceof C0136e0)) {
                            ((C0158p0) abstractC0151m9).f295j = true;
                        }
                    }
                }
                this.f273a.getClass();
                m1252f(c0127a);
                this.f273a.getClass();
                return c0127a;
            }
            throw new UnsupportedOperationException(new InvalidClassException(C0127a.class.getName(), String.format(Locale.getDefault(), atm.m897d("29150F19287804150E55283D191F081C2D3403001F550D0C245A0D1C38304A2F2F3C08784F095A5D29201A1F1901293C4A5F0955232A4A1B5A19293F0B190355190D233E535B"), uuid, f272f)));
        }
        throw new UnsupportedOperationException(new InvalidClassException(C0127a.class.getName(), String.format(Locale.getDefault(), atm.m897d("29150F19287804150E55283D191F081C2D3403001F550D0C245A0D1C38304A0C1F073F3105145A502878421F0205293B1E1F1E55693C4354"), Integer.valueOf(c), 3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fe, code lost:
        if (r0.f300g < 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0109, code lost:
        if ((r0 instanceof com.github.catvod.spider.merge.p014O.C0136e0) == false) goto L81;
     */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m1252f(com.github.catvod.spider.merge.p014O.C0127a r7) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p014O.C0147k.m1252f(com.github.catvod.spider.merge.O.a):void");
    }
}
