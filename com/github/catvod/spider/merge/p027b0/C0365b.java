package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p025a0.AbstractC0299s;
import com.github.catvod.spider.merge.p025a0.C0283c;
import com.github.catvod.spider.merge.p025a0.C0284d;
import com.github.catvod.spider.merge.p025a0.C0285e;
import com.github.catvod.spider.merge.p025a0.C0286f;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p025a0.C0296p;
import com.github.catvod.spider.merge.p025a0.C0302v;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.b0.b */
/* loaded from: classes.dex */
public final class C0365b extends AbstractC0391j1 {

    /* renamed from: A */
    static final String[] f745A;

    /* renamed from: B */
    static final String[] f746B;

    /* renamed from: C */
    static final String[] f747C;

    /* renamed from: D */
    static final String[] f748D;

    /* renamed from: E */
    static final String[] f749E;

    /* renamed from: x */
    static final String[] f750x;

    /* renamed from: y */
    static final String[] f751y;

    /* renamed from: z */
    static final String[] f752z;

    /* renamed from: l */
    private EnumC0313B f753l;

    /* renamed from: m */
    private EnumC0313B f754m;

    /* renamed from: n */
    private boolean f755n;

    /* renamed from: o */
    private C0293m f756o;

    /* renamed from: p */
    private C0296p f757p;

    /* renamed from: q */
    private ArrayList<C0293m> f758q;

    /* renamed from: r */
    private ArrayList<EnumC0313B> f759r;

    /* renamed from: s */
    private List<String> f760s;

    /* renamed from: t */
    private C0335M f761t;

    /* renamed from: u */
    private boolean f762u;

    /* renamed from: v */
    private boolean f763v;

    /* renamed from: w */
    private String[] f764w = {null};

    static {
        String m897d = atm.m897d("091B0A01253704");
        String m897d2 = atm.m897d("020E1719");
        String m897d3 = atm.m897d("1E1B181929");
        String m897d4 = atm.m897d("1E1E");
        String m897d5 = atm.m897d("1E12");
        f750x = new String[]{atm.m897d("0B0A0A19292C"), m897d, m897d2, atm.m897d("071B0804393D0F"), atm.m897d("051810102F2C"), m897d3, m897d4, m897d5};
        f751y = new String[]{atm.m897d("0516"), atm.m897d("1F16")};
        f752z = new String[]{atm.m897d("080F0E012336")};
        f745A = new String[]{m897d2, m897d3};
        String m897d6 = atm.m897d("050A0E123E371F0A");
        String m897d7 = atm.m897d("050A0E1C2336");
        f746B = new String[]{m897d6, m897d7};
        String m897d8 = atm.m897d("0E1E");
        String m897d9 = atm.m897d("0E0E");
        String m897d10 = atm.m897d("0613");
        String m897d11 = atm.m897d("1A");
        f747C = new String[]{m897d8, m897d9, m897d10, m897d6, m897d7, m897d11, atm.m897d("1818"), atm.m897d("180A"), atm.m897d("180E"), atm.m897d("180E19")};
        f748D = new String[]{m897d, atm.m897d("091516123E371F0A"), m897d8, m897d9, m897d10, m897d6, m897d7, m897d11, atm.m897d("1818"), atm.m897d("180A"), atm.m897d("180E"), atm.m897d("180E19"), atm.m897d("1E18151135"), m897d4, atm.m897d("1E1C151A38"), m897d5, atm.m897d("1E121F1428"), atm.m897d("1E08")};
        f749E = new String[]{atm.m897d("0B1E1E07292B19"), atm.m897d("0B0A0A19292C"), atm.m897d("0B081F14"), atm.m897d("0B080E1C2F340F"), atm.m897d("0B09131129"), atm.m897d("081B0910"), atm.m897d("081B09102A37040E"), atm.m897d("081D091A39360E"), atm.m897d("0816151627291F150E10"), atm.m897d("08151E0C"), atm.m897d("0808"), atm.m897d("080F0E012336"), m897d, atm.m897d("091F1401292A"), atm.m897d("091516"), atm.m897d("091516123E371F0A"), atm.m897d("091517182D360E"), m897d8, atm.m897d("0E1F0E14253419"), atm.m897d("0E1308"), atm.m897d("0E130C"), atm.m897d("0E16"), m897d9, atm.m897d("0F17181028"), atm.m897d("0C131F19282B0F0E"), atm.m897d("0C131D162D281E13151B"), atm.m897d("0C131D003E3D"), atm.m897d("0C151501292A"), atm.m897d("0C150818"), atm.m897d("0C081B1829"), atm.m897d("0C081B18292B0F0E"), atm.m897d("024B"), atm.m897d("0248"), atm.m897d("0249"), atm.m897d("024E"), atm.m897d("024F"), atm.m897d("024C"), atm.m897d("021F1B11"), atm.m897d("021F1B11292A"), atm.m897d("021D081A3928"), atm.m897d("0208"), m897d2, atm.m897d("031C0814213D"), atm.m897d("03171D"), atm.m897d("03140A0038"), atm.m897d("0309131B283D12"), m897d10, atm.m897d("0613141E"), atm.m897d("0613090125360D"), atm.m897d("071B0804393D0F"), atm.m897d("071F1400"), atm.m897d("071F0E14"), atm.m897d("041B0C"), atm.m897d("04151F182E3D0E"), atm.m897d("04151C072D350F09"), atm.m897d("041509163E311A0E"), atm.m897d("051810102F2C"), atm.m897d("0516"), m897d11, atm.m897d("1A1B081421"), atm.m897d("1A161B1C222C0F020E"), atm.m897d("1A081F"), atm.m897d("1919081C3C2C"), atm.m897d("191F1901253704"), atm.m897d("191F16102F2C"), atm.m897d("190E031929"), atm.m897d("190F17182D2A13"), m897d3, atm.m897d("1E18151135"), m897d4, atm.m897d("1E1F02012D2A0F1B"), atm.m897d("1E1C151A38"), m897d5, atm.m897d("1E121F1428"), atm.m897d("1E130E1929"), atm.m897d("1E08"), atm.m897d("1F16"), atm.m897d("1D1808"), atm.m897d("12170A")};
    }

    /* renamed from: F */
    private boolean m714F(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f840e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String m973j0 = this.f840e.get(size).m973j0();
            if (C0280b.m1057c(m973j0, strArr)) {
                return true;
            }
            if (C0280b.m1057c(m973j0, strArr2)) {
                return false;
            }
            if (strArr3 != null && C0280b.m1057c(m973j0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m705O(com.github.catvod.spider.merge.p025a0.AbstractC0299s r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r0 = r2.f840e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.a0.h r0 = r2.f839d
            goto L27
        Lb:
            boolean r0 = r2.f763v
            if (r0 == 0) goto L23
            com.github.catvod.spider.merge.a0.m r0 = r2.m649a()
            java.lang.String r0 = r0.m973j0()
            java.lang.String[] r1 = com.github.catvod.spider.merge.p027b0.C0311A.f597A
            boolean r0 = com.github.catvod.spider.merge.p024Z.C0280b.m1057c(r0, r1)
            if (r0 == 0) goto L23
            r2.m707M(r3)
            goto L2a
        L23:
            com.github.catvod.spider.merge.a0.m r0 = r2.m649a()
        L27:
            r0.m995M(r3)
        L2a:
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.p025a0.C0293m
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.a0.m r3 = (com.github.catvod.spider.merge.p025a0.C0293m) r3
            com.github.catvod.spider.merge.b0.G r0 = r3.m963t0()
            boolean r0 = r0.m841e()
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.a0.p r0 = r2.f757p
            if (r0 == 0) goto L41
            r0.m939z0(r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p027b0.C0365b.m705O(com.github.catvod.spider.merge.a0.s):void");
    }

    /* renamed from: X */
    private static boolean m696X(ArrayList<C0293m> arrayList, C0293m c0293m) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == c0293m) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* renamed from: m */
    private void m678m(String... strArr) {
        for (int size = this.f840e.size() - 1; size >= 0; size--) {
            C0293m c0293m = this.f840e.get(size);
            String m973j0 = c0293m.m973j0();
            int i = C0280b.f509f;
            int length = strArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (strArr[i2].equals(m973j0)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z || c0293m.m973j0().equals(atm.m897d("020E1719"))) {
                return;
            }
            this.f840e.remove(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final List<String> m719A() {
        return this.f760s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean m718B(String str) {
        return m717C(str, f752z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final boolean m717C(String str, String[] strArr) {
        String[] strArr2 = f750x;
        String[] strArr3 = this.f764w;
        strArr3[0] = str;
        return m714F(strArr3, strArr2, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean m716D(String[] strArr) {
        return m714F(strArr, f750x, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean m715E(String str) {
        for (int size = this.f840e.size() - 1; size >= 0; size--) {
            String m973j0 = this.f840e.get(size).m973j0();
            if (m973j0.equals(str)) {
                return true;
            }
            if (!C0280b.m1057c(m973j0, f746B)) {
                return false;
            }
        }
        C0277c.m1071d(atm.m897d("39121500203C4A1415016C3A0F5A08102D3B021B181929"));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean m713G(String str) {
        String[] strArr = f745A;
        String[] strArr2 = this.f764w;
        strArr2[0] = str;
        return m714F(strArr2, strArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final C0293m m712H(C0337N c0337n) {
        if (c0337n.m816u() && !c0337n.f704n.isEmpty() && c0337n.f704n.m1034k(this.f843h) > 0) {
            Object[] objArr = {c0337n.f695e};
            C0317D m849a = this.f836a.m849a();
            if (m849a.m857a()) {
                m849a.add(new C0315C(this.f837b, atm.m897d("2E0815053C3D0E5A1E003C3403191B0129780B0E0E07253A1F0E1F5D3F714A13145538390D5A21503F05"), objArr));
            }
        }
        if (c0337n.f703m) {
            C0293m m709K = m709K(c0337n);
            this.f840e.add(m709K);
            this.f838c.m764v(EnumC0388i1.f791a);
            C0346S c0346s = this.f838c;
            C0335M c0335m = this.f761t;
            c0335m.mo803h();
            c0335m.m815v(m709K.m962u0());
            c0346s.m775k(c0335m);
            return m709K;
        }
        C0323G m641i = m641i(c0337n.m814w(), this.f843h);
        C0319E c0319e = this.f843h;
        C0283c c0283c = c0337n.f704n;
        c0319e.m853c(c0283c);
        C0293m c0293m = new C0293m(m641i, null, c0283c);
        m705O(c0293m);
        this.f840e.add(c0293m);
        return c0293m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final void m711I(C0327I c0327i) {
        AbstractC0299s c0286f;
        C0293m m649a = m649a();
        String m973j0 = m649a.m973j0();
        String m831l = c0327i.m831l();
        if (c0327i instanceof C0325H) {
            c0286f = new C0284d(m831l);
        } else {
            c0286f = mo646d(m973j0) ? new C0286f(m831l) : new C0302v(m831l);
        }
        m649a.m995M(c0286f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final void m710J(C0329J c0329j) {
        m705O(new C0285e(c0329j.m828m()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final C0293m m709K(C0337N c0337n) {
        C0323G m641i = m641i(c0337n.m814w(), this.f843h);
        C0319E c0319e = this.f843h;
        C0283c c0283c = c0337n.f704n;
        c0319e.m853c(c0283c);
        C0293m c0293m = new C0293m(m641i, null, c0283c);
        m705O(c0293m);
        if (c0337n.f703m) {
            if (!m641i.m839g()) {
                m641i.m834l();
            } else if (!m641i.m842d()) {
                this.f838c.m767s(atm.m897d("3E1B1D55177D19275A162D3604150E552E3D4A091F192A780916150625360D415A1B232C4A1B5A0323310E5A0E142B"), m641i.m836j());
            }
        }
        return c0293m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final C0296p m708L(C0337N c0337n, boolean z, boolean z2) {
        C0323G m641i = m641i(c0337n.m814w(), this.f843h);
        C0319E c0319e = this.f843h;
        C0283c c0283c = c0337n.f704n;
        c0319e.m853c(c0283c);
        C0296p c0296p = new C0296p(m641i, c0283c);
        if (!z2 || !m697W(atm.m897d("1E1F170520391E1F"))) {
            this.f757p = c0296p;
        }
        m705O(c0296p);
        if (z) {
            this.f840e.add(c0296p);
        }
        return c0296p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final void m707M(AbstractC0299s abstractC0299s) {
        C0293m c0293m;
        C0293m m659y = m659y(atm.m897d("1E1B181929"));
        boolean z = false;
        if (m659y == null) {
            c0293m = this.f840e.get(0);
        } else if (m659y.m971l0() != null) {
            c0293m = m659y.m971l0();
            z = true;
        } else {
            c0293m = m684j(m659y);
        }
        if (!z) {
            c0293m.m995M(abstractC0299s);
            return;
        }
        C0277c.m1063l(m659y);
        m659y.m989S(abstractC0299s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m706N() {
        this.f758q.add(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final C0293m m704P() {
        C0293m c0293m = new C0293m(m641i(atm.m897d("020E1719"), this.f843h), null, null);
        m705O(c0293m);
        this.f840e.add(c0293m);
        return c0293m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean m703Q(C0293m c0293m) {
        return m696X(this.f758q, c0293m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean m702R(C0293m c0293m) {
        return C0280b.m1057c(c0293m.m973j0(), f749E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public final void m701S() {
        this.f754m = this.f753l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public final void m700T(C0293m c0293m) {
        if (this.f755n) {
            return;
        }
        String mo928a = c0293m.mo928a(atm.m897d("02081F13"));
        if (mo928a.length() != 0) {
            this.f841f = mo928a;
            this.f755n = true;
            this.f839d.m930G(mo928a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final void m699U() {
        this.f760s = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean m698V(C0293m c0293m) {
        return m696X(this.f840e, c0293m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public final boolean m697W(String str) {
        return m659y(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public final EnumC0313B m695Y() {
        return this.f754m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public final C0293m m694Z() {
        return this.f840e.remove(this.f840e.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final C0293m m693a0(String str) {
        for (int size = this.f840e.size() - 1; size >= 0; size--) {
            C0293m c0293m = this.f840e.get(size);
            this.f840e.remove(size);
            if (c0293m.m973j0().equals(str)) {
                boolean z = this.f842g instanceof C0335M;
                return c0293m;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final EnumC0313B m692b0() {
        if (this.f759r.size() > 0) {
            ArrayList<EnumC0313B> arrayList = this.f759r;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p027b0.AbstractC0391j1
    /* renamed from: c */
    public final void mo647c(Reader reader, C0321F c0321f) {
        super.mo647c(reader, c0321f);
        this.f753l = EnumC0313B.f635a;
        this.f754m = null;
        this.f755n = false;
        this.f756o = null;
        this.f757p = null;
        this.f758q = new ArrayList<>();
        this.f759r = new ArrayList<>();
        this.f760s = new ArrayList();
        this.f761t = new C0335M();
        this.f762u = true;
        this.f763v = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final int m691c0(C0293m c0293m) {
        for (int i = 0; i < this.f758q.size(); i++) {
            if (c0293m == this.f758q.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p027b0.AbstractC0391j1
    /* renamed from: d */
    public final boolean mo646d(String str) {
        return str.equals(atm.m897d("1919081C3C2C")) || str.equals(atm.m897d("190E031929"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final boolean m690d0(AbstractC0341P abstractC0341P, EnumC0313B enumC0313B) {
        this.f842g = abstractC0341P;
        return enumC0313B.mo638d(abstractC0341P, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p027b0.AbstractC0391j1
    /* renamed from: e */
    public final boolean mo645e(AbstractC0341P abstractC0341P) {
        this.f842g = abstractC0341P;
        return this.f753l.mo638d(abstractC0341P, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void m689e0(C0293m c0293m) {
        m682k(c0293m);
        this.f758q.add(c0293m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final void m688f0(EnumC0313B enumC0313B) {
        this.f759r.add(enumC0313B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final void m687g0(C0293m c0293m, int i) {
        m682k(c0293m);
        try {
            this.f758q.add(i, c0293m);
        } catch (IndexOutOfBoundsException unused) {
            this.f758q.add(c0293m);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0053 -> B:25:0x0054). Please submit an issue!!! */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m686h0() {
        /*
            r9 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r0 = r9.f840e
            int r0 = r0.size()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto Lb
            return
        Lb:
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r0 = r9.f758q
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L23
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r0 = r9.f758q
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r0 = r0.get(r2)
            com.github.catvod.spider.merge.a0.m r0 = (com.github.catvod.spider.merge.p025a0.C0293m) r0
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L89
            boolean r2 = r9.m698V(r0)
            if (r2 == 0) goto L2d
            goto L89
        L2d:
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r2 = r9.f758q
            int r2 = r2.size()
            int r3 = r2 + (-12)
            r4 = 0
            if (r3 >= 0) goto L39
            r3 = 0
        L39:
            r5 = 1
            int r2 = r2 - r5
            r6 = r2
        L3c:
            if (r6 != r3) goto L40
            r3 = r9
            goto L54
        L40:
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r0 = r9.f758q
            int r6 = r6 + (-1)
            java.lang.Object r0 = r0.get(r6)
            com.github.catvod.spider.merge.a0.m r0 = (com.github.catvod.spider.merge.p025a0.C0293m) r0
            if (r0 == 0) goto L52
            boolean r7 = r9.m698V(r0)
            if (r7 == 0) goto L3c
        L52:
            r3 = r9
        L53:
            r5 = 0
        L54:
            if (r5 != 0) goto L60
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r0 = r3.f758q
            int r6 = r6 + 1
            java.lang.Object r0 = r0.get(r6)
            com.github.catvod.spider.merge.a0.m r0 = (com.github.catvod.spider.merge.p025a0.C0293m) r0
        L60:
            com.github.catvod.spider.merge.p023Y.C0277c.m1063l(r0)
            com.github.catvod.spider.merge.a0.m r5 = new com.github.catvod.spider.merge.a0.m
            java.lang.String r7 = r0.m973j0()
            com.github.catvod.spider.merge.b0.E r8 = r3.f843h
            com.github.catvod.spider.merge.b0.G r7 = r3.m641i(r7, r8)
            com.github.catvod.spider.merge.a0.c r8 = r0.mo924e()
            com.github.catvod.spider.merge.a0.c r8 = r8.clone()
            r5.<init>(r7, r1, r8)
            r3.m705O(r5)
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r7 = r3.f840e
            r7.add(r5)
            java.util.ArrayList<com.github.catvod.spider.merge.a0.m> r7 = r3.f758q
            r7.set(r6, r5)
            if (r6 != r2) goto L53
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p027b0.C0365b.m686h0():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final void m685i0(C0293m c0293m) {
        int size = this.f758q.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.f758q.get(size) != c0293m);
        this.f758q.remove(size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final C0293m m684j(C0293m c0293m) {
        for (int size = this.f840e.size() - 1; size >= 0; size--) {
            if (this.f840e.get(size) == c0293m) {
                return this.f840e.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final boolean m683j0(C0293m c0293m) {
        for (int size = this.f840e.size() - 1; size >= 0; size--) {
            if (this.f840e.get(size) == c0293m) {
                this.f840e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    final void m682k(C0293m c0293m) {
        int size = this.f758q.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            C0293m c0293m2 = this.f758q.get(size);
            if (c0293m2 == null) {
                return;
            }
            if (c0293m.m973j0().equals(c0293m2.m973j0()) && c0293m.mo924e().equals(c0293m2.mo924e())) {
                i2++;
            }
            if (i2 == 3) {
                this.f758q.remove(size);
                return;
            }
            size--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final void m681k0(C0293m c0293m, C0293m c0293m2) {
        ArrayList<C0293m> arrayList = this.f758q;
        int lastIndexOf = arrayList.lastIndexOf(c0293m);
        C0277c.m1067h(lastIndexOf != -1);
        arrayList.set(lastIndexOf, c0293m2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final void m680l() {
        C0293m c0293m;
        while (!this.f758q.isEmpty()) {
            int size = this.f758q.size();
            if (size > 0) {
                c0293m = this.f758q.remove(size - 1);
                continue;
            } else {
                c0293m = null;
                continue;
            }
            if (c0293m == null) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final void m679l0() {
        if (!m697W(atm.m897d("08151E0C"))) {
            this.f840e.add(this.f839d.m1003z0());
        }
        this.f753l = EnumC0313B.f641g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m677m0() {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p027b0.C0365b.m677m0():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m676n() {
        m678m(atm.m897d("1E18151135"), atm.m897d("1E1C151A38"), atm.m897d("1E121F1428"), atm.m897d("1E1F170520391E1F"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final void m675n0() {
        this.f757p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m674o() {
        m678m(atm.m897d("1E1B181929"), atm.m897d("1E1F170520391E1F"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public final void m673o0(boolean z) {
        this.f763v = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m672p() {
        m678m(atm.m897d("1E08"), atm.m897d("1E1F170520391E1F"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final void m671p0(C0293m c0293m) {
        this.f756o = c0293m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m670q() {
        String m897d = atm.m897d("1A");
        m663u(m897d);
        if (!m897d.equals(m649a().m973j0())) {
            m668r(this.f753l);
        }
        m693a0(m897d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public final EnumC0313B m669q0() {
        return this.f753l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m668r(EnumC0313B enumC0313B) {
        if (this.f836a.m849a().m857a()) {
            this.f836a.m849a().add(new C0315C(this.f837b, atm.m897d("3F141F0D3C3D090E1F116C7D195A0E1A273D045A21503F054A0D1210227803145A0638391E1F5A2E692B37"), this.f842g.getClass().getSimpleName(), this.f842g, enumC0313B));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public final int m667r0() {
        return this.f759r.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m666s(boolean z) {
        this.f762u = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public final void m665s0(EnumC0313B enumC0313B) {
        this.f753l = enumC0313B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m664t() {
        return this.f762u;
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("3E081F100E2D03161E103E23090F080729361E2E151E293657"));
        m635a.append(this.f842g);
        m635a.append(atm.m897d("465A09012D2C0F47"));
        m635a.append(this.f753l);
        m635a.append(atm.m897d("465A19003E2A0F140E30203D071F140171"));
        m635a.append(m649a());
        m635a.append('}');
        return m635a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final void m663u(String str) {
        while (C0280b.m1057c(m649a().m973j0(), f747C)) {
            if (str != null && m648b(str)) {
                return;
            }
            m694Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final void m662v(boolean z) {
        String[] strArr = z ? f748D : f747C;
        while (C0280b.m1057c(m649a().m973j0(), strArr)) {
            m694Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final C0293m m661w(String str) {
        for (int size = this.f758q.size() - 1; size >= 0; size--) {
            C0293m c0293m = this.f758q.get(size);
            if (c0293m == null) {
                return null;
            }
            if (c0293m.m973j0().equals(str)) {
                return c0293m;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final C0296p m660x() {
        return this.f757p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final C0293m m659y(String str) {
        int size = this.f840e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            C0293m c0293m = this.f840e.get(size);
            if (c0293m.m973j0().equals(str)) {
                return c0293m;
            }
            size--;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final C0293m m658z() {
        return this.f756o;
    }
}
