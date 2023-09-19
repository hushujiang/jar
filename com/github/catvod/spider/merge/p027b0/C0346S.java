package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.C0295o;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.S */
/* loaded from: classes.dex */
public final class C0346S {

    /* renamed from: u */
    private static final char[] f710u;

    /* renamed from: v */
    static final int[] f711v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a */
    private final C0362a f712a;

    /* renamed from: b */
    private final C0317D f713b;

    /* renamed from: o */
    private String f726o;

    /* renamed from: p */
    private String f727p;

    /* renamed from: q */
    private int f728q;

    /* renamed from: c */
    private EnumC0388i1 f714c = EnumC0388i1.f791a;

    /* renamed from: d */
    private AbstractC0341P f715d = null;

    /* renamed from: e */
    private boolean f716e = false;

    /* renamed from: f */
    private String f717f = null;

    /* renamed from: g */
    private final StringBuilder f718g = new StringBuilder(1024);

    /* renamed from: h */
    StringBuilder f719h = new StringBuilder(1024);

    /* renamed from: i */
    C0337N f720i = new C0337N();

    /* renamed from: j */
    C0335M f721j = new C0335M();

    /* renamed from: k */
    AbstractC0339O f722k = this.f720i;

    /* renamed from: l */
    C0327I f723l = new C0327I();

    /* renamed from: m */
    C0331K f724m = new C0331K();

    /* renamed from: n */
    C0329J f725n = new C0329J();

    /* renamed from: r */
    private int f729r = -1;

    /* renamed from: s */
    private final int[] f730s = new int[1];

    /* renamed from: t */
    private final int[] f731t = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f710u = cArr;
        Arrays.sort(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0346S(C0362a c0362a, C0317D c0317d) {
        this.f712a = c0362a;
        this.f713b = c0317d;
    }

    /* renamed from: d */
    private void m782d(String str, Object... objArr) {
        if (this.f713b.m857a()) {
            C0317D c0317d = this.f713b;
            C0362a c0362a = this.f712a;
            c0317d.add(new C0315C(c0362a, String.format(atm.m897d("23140C1420310E5A191D2D2A0B190E103E78181F1C103E3D04191F4F6C") + str, objArr)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m785a(EnumC0388i1 enumC0388i1) {
        m764v(enumC0388i1);
        this.f712a.m745a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final String m784b() {
        return this.f726o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final String m783c() {
        if (this.f727p == null) {
            StringBuilder m635a = C0424a.m635a(atm.m897d("5655"));
            m635a.append(this.f726o);
            this.f727p = m635a.toString();
        }
        return this.f727p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int[] m781e(Character ch, boolean z) {
        int i;
        if (this.f712a.m723w()) {
            return null;
        }
        if ((ch == null || ch.charValue() != this.f712a.m725u()) && !this.f712a.m756G(f710u)) {
            int[] iArr = this.f730s;
            this.f712a.m761B();
            boolean m760C = this.f712a.m760C(atm.m897d("49"));
            String m897d = atm.m897d("51");
            if (m760C) {
                boolean m759D = this.f712a.m759D(atm.m897d("32"));
                C0362a c0362a = this.f712a;
                String m736j = m759D ? c0362a.m736j() : c0362a.m737i();
                if (m736j.length() != 0) {
                    this.f712a.m746Q();
                    if (!this.f712a.m760C(m897d)) {
                        m782d(atm.m897d("0713090625360D5A091021310915161A227805145A2E6A7B4F0927"), m736j);
                    }
                    try {
                        i = Integer.valueOf(m736j, m759D ? 16 : 10).intValue();
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                        m782d(atm.m897d("09121B072D3B1E1F0855177D19275A1A392C19131E106C370C5A0C1420310E5A0814223F0F"), Integer.valueOf(i));
                        iArr[0] = 65533;
                    } else {
                        if (i >= 128) {
                            int[] iArr2 = f711v;
                            if (i < 160) {
                                m782d(atm.m897d("09121B072D3B1E1F0855177D19275A1C3F7804150E552D781C1B161C28781F141316233C0F5A191A283D4A0A151C222C"), Integer.valueOf(i));
                                i = iArr2[i - 128];
                            }
                        }
                        iArr[0] = i;
                    }
                    return iArr;
                }
                m782d(atm.m897d("040F17103E31095A08102A3D181F141629781D130E1D6C36055A1400213D181B1606"), new Object[0]);
            } else {
                String m734l = this.f712a.m734l();
                boolean m758E = this.f712a.m758E(';');
                if (!(C0295o.m943e(m734l) || (C0295o.m942f(m734l) && m758E))) {
                    this.f712a.m750M();
                    if (m758E) {
                        m782d(atm.m897d("03140C1420310E5A1414213D0E5A08102A3D181F14162978315F0928"), m734l);
                    }
                    return null;
                } else if (!z || (!this.f712a.m753J() && !this.f712a.m754I() && !this.f712a.m757F('=', '-', '_'))) {
                    this.f712a.m746Q();
                    if (!this.f712a.m760C(m897d)) {
                        m782d(atm.m897d("0713090625360D5A091021310915161A227805145A2E6A7D1927"), m734l);
                    }
                    int m945c = C0295o.m945c(m734l, this.f731t);
                    if (m945c == 1) {
                        iArr[0] = this.f731t[0];
                        return iArr;
                    } else if (m945c == 2) {
                        return this.f731t;
                    } else {
                        C0277c.m1071d(atm.m897d("3F141F0D3C3D090E1F116C3B021B08142F2C0F0809553E3D1E0F081B293C4A1C15076C") + m734l);
                        throw null;
                    }
                }
            }
            this.f712a.m750M();
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m780f() {
        this.f725n.mo803h();
        this.f725n.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m779g() {
        this.f724m.mo803h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final AbstractC0339O m778h(boolean z) {
        AbstractC0339O abstractC0339O;
        if (z) {
            abstractC0339O = this.f720i;
            abstractC0339O.mo812y();
        } else {
            abstractC0339O = this.f721j;
            abstractC0339O.mo803h();
        }
        this.f722k = abstractC0339O;
        return abstractC0339O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m777i() {
        AbstractC0341P.m802i(this.f719h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m776j(char c) {
        if (this.f717f == null) {
            this.f717f = String.valueOf(c);
        } else {
            if (this.f718g.length() == 0) {
                this.f718g.append(this.f717f);
            }
            this.f718g.append(c);
        }
        this.f723l.m801j(this.f729r);
        this.f723l.m810a(this.f712a.m751L());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m775k(AbstractC0341P abstractC0341P) {
        C0277c.m1068g(this.f716e);
        this.f715d = abstractC0341P;
        this.f716e = true;
        abstractC0341P.m801j(this.f728q);
        abstractC0341P.m810a(this.f712a.m751L());
        this.f729r = -1;
        int i = abstractC0341P.f705a;
        if (i == 2) {
            this.f726o = ((C0337N) abstractC0341P).f694d;
            this.f727p = null;
        } else if (i == 3) {
            C0335M c0335m = (C0335M) abstractC0341P;
            if (c0335m.m816u()) {
                m767s(atm.m897d("2B0E0E07253A1F0E1F066C31041915073E3D090E160C6C28181F0910222C4A15145529360E5A0E142B7831555F0611"), c0335m.f695e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m774l(String str) {
        if (this.f717f == null) {
            this.f717f = str;
        } else {
            if (this.f718g.length() == 0) {
                this.f718g.append(this.f717f);
            }
            this.f718g.append(str);
        }
        this.f723l.m801j(this.f729r);
        this.f723l.m810a(this.f712a.m751L());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m773m(StringBuilder sb) {
        if (this.f717f == null) {
            this.f717f = sb.toString();
        } else {
            if (this.f718g.length() == 0) {
                this.f718g.append(this.f717f);
            }
            this.f718g.append((CharSequence) sb);
        }
        this.f723l.m801j(this.f729r);
        this.f723l.m810a(this.f712a.m751L());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m772n() {
        m775k(this.f725n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m771o() {
        m775k(this.f724m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m770p() {
        this.f722k.m818s();
        m775k(this.f722k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m769q(EnumC0388i1 enumC0388i1) {
        if (this.f713b.m857a()) {
            this.f713b.add(new C0315C(this.f712a, atm.m897d("3F141F0D3C3D090E1F1120214A081F142F300F1E5A10223C4A151C552A31061F5A5D09172C535A1C227803140A003878190E1B012978315F0928"), enumC0388i1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m768r(EnumC0388i1 enumC0388i1) {
        if (this.f713b.m857a()) {
            C0317D c0317d = this.f713b;
            C0362a c0362a = this.f712a;
            c0317d.add(new C0315C(c0362a, atm.m897d("3F141F0D3C3D090E1F116C3B021B08142F2C0F085A52692B4D5A131B6C31040A0F016C2B1E1B0E106C034F0927"), Character.valueOf(c0362a.m725u()), enumC0388i1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m767s(String str, Object... objArr) {
        if (this.f713b.m857a()) {
            this.f713b.add(new C0315C(this.f712a, str, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m766t() {
        return this.f726o != null && this.f722k.m814w().equalsIgnoreCase(this.f726o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final AbstractC0341P m765u() {
        while (!this.f716e) {
            this.f714c.mo636g(this, this.f712a);
        }
        StringBuilder sb = this.f718g;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            C0327I c0327i = this.f723l;
            c0327i.m832k(sb2);
            this.f717f = null;
            return c0327i;
        }
        String str = this.f717f;
        if (str == null) {
            this.f716e = false;
            return this.f715d;
        }
        C0327I c0327i2 = this.f723l;
        c0327i2.m832k(str);
        this.f717f = null;
        return c0327i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final void m764v(EnumC0388i1 enumC0388i1) {
        int ordinal = enumC0388i1.ordinal();
        if (ordinal != 0) {
            if (ordinal == 7) {
                this.f728q = this.f712a.m751L();
            }
        } else if (this.f729r == -1) {
            this.f729r = this.f712a.m751L();
        }
        this.f714c = enumC0388i1;
    }
}
