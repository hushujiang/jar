package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p027b0.C0343Q;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.c0.Q */
/* loaded from: classes.dex */
public final class C0443Q {

    /* renamed from: d */
    private static final String[] f860d = {atm.m897d("46"), atm.m897d("54"), atm.m897d("41"), atm.m897d("14"), atm.m897d("4A")};

    /* renamed from: e */
    private static final String[] f861e = {atm.m897d("57"), atm.m897d("4B47"), atm.m897d("3447"), atm.m897d("4E47"), atm.m897d("4047"), atm.m897d("1447")};

    /* renamed from: f */
    private static final Pattern f862f = Pattern.compile(atm.m897d("4252215E61054345522928734345531B64041950522E6775375345293F72361E515C73"), 2);

    /* renamed from: g */
    private static final Pattern f863g = Pattern.compile(atm.m897d("422151581171555226116771"));

    /* renamed from: a */
    private final C0343Q f864a;

    /* renamed from: b */
    private final String f865b;

    /* renamed from: c */
    private final List<AbstractC0440N> f866c = new ArrayList();

    private C0443Q(String str) {
        C0277c.m1065j(str);
        String trim = str.trim();
        this.f865b = trim;
        this.f864a = new C0343Q(trim);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m621a(char r10) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p029c0.C0443Q.m621a(char):void");
    }

    /* renamed from: b */
    private int m620b() {
        String trim = this.f864a.m799b().trim();
        int i = C0280b.f509f;
        boolean z = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else if (!Character.isDigit(trim.codePointAt(i2))) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C0277c.m1066i(z, atm.m897d("23141E103478070F09016C3A0F5A1400213D181319"));
        return Integer.parseInt(trim);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* renamed from: c */
    private void m619c(boolean z) {
        String m897d = z ? atm.m897d("5019151B38390314093A3B36") : atm.m897d("5019151B3839031409");
        this.f864a.m797d(m897d);
        String m786o = C0343Q.m786o(this.f864a.m800a('(', ')'));
        C0277c.m1064k(m786o, m897d + atm.m897d("420E1F0D38714A0B0F103E214A170F06387804150E552E3D4A1F17053821"));
        this.f866c.add(z ? new C0470r(m786o) : new C0471s(m786o, 0));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* renamed from: d */
    private void m618d(boolean z) {
        String m897d = z ? atm.m897d("5019151B3839031409222437061F3502220C0F020E") : atm.m897d("5019151B3839031409222437061F2E10342C");
        this.f864a.m797d(m897d);
        String m786o = C0343Q.m786o(this.f864a.m800a('(', ')'));
        C0277c.m1064k(m786o, m897d + atm.m897d("420E1F0D38714A0B0F103E214A170F06387804150E552E3D4A1F17053821"));
        this.f866c.add(z ? new C0472t(m786o, 0) : new C0473u(m786o));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m617e(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.b0.Q r0 = r8.f864a
            java.lang.String r0 = r0.m799b()
            java.lang.String r0 = com.github.catvod.spider.merge.p029c0.C0441O.m623b(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.p029c0.C0443Q.f862f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.p029c0.C0443Q.f863g
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "051E1E"
            java.lang.String r3 = com.github.catvod.spider.merge.atm.m897d(r3)
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L28
            r0 = 1
        L26:
            r4 = 2
            goto L80
        L28:
            java.lang.String r3 = "0F0C1F1B"
            java.lang.String r3 = com.github.catvod.spider.merge.atm.m897d(r3)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            r0 = 0
            goto L26
        L36:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "342651"
            java.lang.String r7 = com.github.catvod.spider.merge.atm.m897d(r7)
            if (r3 == 0) goto L6e
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L57
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L57:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L6b
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L6b:
            r0 = r4
            r4 = r5
            goto L80
        L6e:
            boolean r1 = r2.matches()
            if (r1 == 0) goto La9
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L80:
            if (r10 == 0) goto L94
            if (r9 == 0) goto L8c
            java.util.List<com.github.catvod.spider.merge.c0.N> r9 = r8.f866c
            com.github.catvod.spider.merge.c0.I r10 = new com.github.catvod.spider.merge.c0.I
            r10.<init>(r4, r0)
            goto La5
        L8c:
            java.util.List<com.github.catvod.spider.merge.c0.N> r9 = r8.f866c
            com.github.catvod.spider.merge.c0.J r10 = new com.github.catvod.spider.merge.c0.J
            r10.<init>(r4, r0)
            goto La5
        L94:
            if (r9 == 0) goto L9e
            java.util.List<com.github.catvod.spider.merge.c0.N> r9 = r8.f866c
            com.github.catvod.spider.merge.c0.H r10 = new com.github.catvod.spider.merge.c0.H
            r10.<init>(r4, r0)
            goto La5
        L9e:
            java.util.List<com.github.catvod.spider.merge.c0.N> r9 = r8.f866c
            com.github.catvod.spider.merge.c0.G r10 = new com.github.catvod.spider.merge.c0.G
            r10.<init>(r4, r0)
        La5:
            r9.add(r10)
            return
        La9:
            com.github.catvod.spider.merge.c0.S r9 = new com.github.catvod.spider.merge.c0.S
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "29150F19287804150E553C3918091F55222C0257131B283D125A5D503F7F505A0F1B29201A1F1901293C4A1C150721391E"
            java.lang.String r0 = com.github.catvod.spider.merge.atm.m897d(r0)
            r9.<init>(r0, r10)
            goto Lba
        Lb9:
            throw r9
        Lba:
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p029c0.C0443Q.m617e(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* renamed from: f */
    private void m616f() {
        AbstractC0440N c0438l;
        AbstractC0440N c0431e;
        ?? r0;
        ?? r02;
        AbstractC0440N c0467o;
        ?? r1;
        AbstractC0440N c0461i;
        ?? r03;
        if (this.f864a.m791j(atm.m897d("49"))) {
            String m796e = this.f864a.m796e();
            C0277c.m1065j(m796e);
            this.f866c.add(new C0475w(m796e));
        } else if (this.f864a.m791j(atm.m897d("44"))) {
            String m796e2 = this.f864a.m796e();
            C0277c.m1065j(m796e2);
            this.f866c.add(new C0461i(m796e2.trim(), 1));
        } else {
            boolean m788m = this.f864a.m788m();
            String m897d = atm.m897d("4006");
            if (m788m || this.f864a.m790k(m897d)) {
                String m623b = C0441O.m623b(this.f864a.m795f());
                C0277c.m1065j(m623b);
                boolean startsWith = m623b.startsWith(m897d);
                String m897d2 = atm.m897d("50");
                if (startsWith) {
                    this.f866c.add(new C0457e(new C0471s(m623b.substring(2), 1), new C0472t(m623b.replace(m897d, m897d2), 1)));
                    return;
                }
                String m897d3 = atm.m897d("16");
                if (m623b.contains(m897d3)) {
                    m623b = m623b.replace(m897d3, m897d2);
                }
                this.f866c.add(new C0471s(m623b, 1));
            } else if (this.f864a.m790k(atm.m897d("31"))) {
                C0343Q c0343q = new C0343Q(this.f864a.m800a('[', ']'));
                String m794g = c0343q.m794g(f861e);
                C0277c.m1065j(m794g);
                c0343q.m793h();
                if (c0343q.m792i()) {
                    if (m794g.startsWith(atm.m897d("34"))) {
                        List<AbstractC0440N> list = this.f866c;
                        c0461i = new C0463k(m794g.substring(1), 0);
                        r03 = list;
                    } else {
                        List<AbstractC0440N> list2 = this.f866c;
                        c0461i = new C0461i(m794g, 0);
                        r03 = list2;
                    }
                    r03.add(c0461i);
                    return;
                }
                if (c0343q.m791j(atm.m897d("57"))) {
                    List<AbstractC0440N> list3 = this.f866c;
                    c0467o = new C0464l(m794g, c0343q.m787n());
                    r1 = list3;
                } else if (c0343q.m791j(atm.m897d("4B47"))) {
                    List<AbstractC0440N> list4 = this.f866c;
                    c0467o = new C0468p(m794g, c0343q.m787n());
                    r1 = list4;
                } else if (c0343q.m791j(atm.m897d("3447"))) {
                    List<AbstractC0440N> list5 = this.f866c;
                    c0467o = new C0469q(m794g, c0343q.m787n());
                    r1 = list5;
                } else if (c0343q.m791j(atm.m897d("4E47"))) {
                    List<AbstractC0440N> list6 = this.f866c;
                    c0467o = new C0466n(m794g, c0343q.m787n());
                    r1 = list6;
                } else if (c0343q.m791j(atm.m897d("4047"))) {
                    List<AbstractC0440N> list7 = this.f866c;
                    c0467o = new C0465m(m794g, c0343q.m787n());
                    r1 = list7;
                } else if (!c0343q.m791j(atm.m897d("1447"))) {
                    throw new C0444S(atm.m897d("29150F19287804150E553C3918091F552D2C1E081317392C0F5A0B00292A135A5D503F7F505A0F1B29201A1F1901293C4A0E151E29364A1B0E556B7D195D"), this.f865b, c0343q.m787n());
                } else {
                    List<AbstractC0440N> list8 = this.f866c;
                    c0467o = new C0467o(m794g, Pattern.compile(c0343q.m787n()));
                    r1 = list8;
                }
                r1.add(c0467o);
            } else if (this.f864a.m791j(atm.m897d("40"))) {
                this.f866c.add(new C0460h());
            } else if (this.f864a.m791j(atm.m897d("50160E5D"))) {
                this.f866c.add(new C0427A(m620b()));
            } else if (this.f864a.m791j(atm.m897d("501D0E5D"))) {
                this.f866c.add(new C0478z(m620b()));
            } else if (this.f864a.m791j(atm.m897d("501F0B5D"))) {
                this.f866c.add(new C0476x(m620b()));
            } else if (this.f864a.m790k(atm.m897d("50121B0664"))) {
                this.f864a.m797d(atm.m897d("50121B06"));
                String m800a = this.f864a.m800a('(', ')');
                C0277c.m1064k(m800a, atm.m897d("50121B06642B0F161F16383718535A06393A47091F19293B1E5A17003F2C4A1415016C3A0F5A1F183C2C13"));
                this.f866c.add(new C0445T(m612j(m800a)));
            } else if (this.f864a.m790k(atm.m897d("5019151B38390314095D"))) {
                m619c(false);
            } else if (this.f864a.m790k(atm.m897d("5019151B38390314093A3B3642"))) {
                m619c(true);
            } else if (this.f864a.m790k(atm.m897d("5019151B3839031409222437061F2E10342C42"))) {
                m618d(false);
            } else if (this.f864a.m790k(atm.m897d("5019151B3839031409222437061F3502220C0F020E5D"))) {
                m618d(true);
            } else if (this.f864a.m790k(atm.m897d("5019151B3839031409312D2C0B52"))) {
                this.f864a.m797d(atm.m897d("5019151B3839031409312D2C0B"));
                String m786o = C0343Q.m786o(this.f864a.m800a('(', ')'));
                C0277c.m1064k(m786o, atm.m897d("5019151B3839031409312D2C0B520E10342C435A0B00292A135A17003F2C4A1415016C3A0F5A1F183C2C13"));
                this.f866c.add(new C0463k(m786o, 1));
            } else if (this.f864a.m790k(atm.m897d("50171B012F300F0952"))) {
                m615g(false);
            } else if (this.f864a.m790k(atm.m897d("50171B012F300F0935022270"))) {
                m615g(true);
            } else if (this.f864a.m790k(atm.m897d("50171B012F300F092D1D23340F2E1F0D3870"))) {
                m614h(false);
            } else if (this.f864a.m790k(atm.m897d("50171B012F300F092D1D23340F350D1B183D120E52"))) {
                m614h(true);
            } else if (this.f864a.m790k(atm.m897d("5014150164"))) {
                this.f864a.m797d(atm.m897d("50141501"));
                String m800a2 = this.f864a.m800a('(', ')');
                C0277c.m1064k(m800a2, atm.m897d("50141501642B0F161F16383718535A06393A191F16102F2C4A170F06387804150E552E3D4A1F17053821"));
                this.f866c.add(new C0448W(m612j(m800a2)));
            } else if (this.f864a.m791j(atm.m897d("50140E1D613B0213161164"))) {
                m617e(false, false);
            } else if (this.f864a.m791j(atm.m897d("50140E1D61340B090E582F3003161E5D"))) {
                m617e(true, false);
            } else if (this.f864a.m791j(atm.m897d("50140E1D61370C570E0C3C3D42"))) {
                m617e(false, true);
            } else if (this.f864a.m791j(atm.m897d("50140E1D61340B090E58233E470E03052970"))) {
                m617e(true, true);
            } else {
                if (this.f864a.m791j(atm.m897d("501C13073F2C4719121C203C"))) {
                    List<AbstractC0440N> list9 = this.f866c;
                    c0438l = new C0429C(0);
                    r02 = list9;
                } else if (this.f864a.m791j(atm.m897d("50161B0638750912131928"))) {
                    List<AbstractC0440N> list10 = this.f866c;
                    c0438l = new C0431E(0);
                    r02 = list10;
                } else if (this.f864a.m791j(atm.m897d("501C13073F2C47151C5838211A1F"))) {
                    List<AbstractC0440N> list11 = this.f866c;
                    c0438l = new C0430D();
                    r02 = list11;
                } else if (!this.f864a.m791j(atm.m897d("50161B063875051C570135280F"))) {
                    if (this.f864a.m791j(atm.m897d("5015141935750912131928"))) {
                        List<AbstractC0440N> list12 = this.f866c;
                        c0431e = new C0429C(1);
                        r0 = list12;
                    } else if (this.f864a.m791j(atm.m897d("501514193575051C570135280F"))) {
                        List<AbstractC0440N> list13 = this.f866c;
                        c0438l = new C0437K();
                        r02 = list13;
                    } else if (this.f864a.m791j(atm.m897d("501F17053821"))) {
                        List<AbstractC0440N> list14 = this.f866c;
                        c0438l = new C0428B();
                        r02 = list14;
                    } else if (this.f864a.m791j(atm.m897d("5008151A38"))) {
                        List<AbstractC0440N> list15 = this.f866c;
                        c0431e = new C0431E(1);
                        r0 = list15;
                    } else if (!this.f864a.m791j(atm.m897d("50171B012F303E1F0201"))) {
                        throw new C0444S(atm.m897d("29150F19287804150E553C3918091F553D2D0F0803556B7D195D405539360F020A102F2C0F1E5A0123330F145A1438784D5F0952"), this.f865b, this.f864a.m787n());
                    } else {
                        List<AbstractC0440N> list16 = this.f866c;
                        c0438l = new C0438L();
                        r02 = list16;
                    }
                    r0.add(c0431e);
                    return;
                } else {
                    List<AbstractC0440N> list17 = this.f866c;
                    c0438l = new C0432F();
                    r02 = list17;
                }
                r02.add(c0438l);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* renamed from: g */
    private void m615g(boolean z) {
        String m897d = z ? atm.m897d("50171B012F300F09350222") : atm.m897d("50171B012F300F09");
        this.f864a.m797d(m897d);
        String m800a = this.f864a.m800a('(', ')');
        C0277c.m1064k(m800a, m897d + atm.m897d("42081F122920435A0B00292A135A17003F2C4A1415016C3A0F5A1F183C2C13"));
        this.f866c.add(z ? new C0461i(Pattern.compile(m800a), 2) : new C0439M(Pattern.compile(m800a)));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* renamed from: h */
    private void m614h(boolean z) {
        String m897d = z ? atm.m897d("50171B012F300F092D1D23340F350D1B183D120E") : atm.m897d("50171B012F300F092D1D23340F2E1F0D38");
        this.f864a.m797d(m897d);
        String m800a = this.f864a.m800a('(', ')');
        C0277c.m1064k(m800a, m897d + atm.m897d("42081F122920435A0B00292A135A17003F2C4A1415016C3A0F5A1F183C2C13"));
        this.f866c.add(z ? new C0463k(Pattern.compile(m800a)) : new C0470r(Pattern.compile(m800a)));
    }

    /* renamed from: j */
    public static AbstractC0440N m612j(String str) {
        try {
            return new C0443Q(str).m613i();
        } catch (IllegalArgumentException e) {
            throw new C0444S(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.c0.N>, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:11:0x0037). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0042). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x001c -> B:7:0x001f). Please submit an issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.github.catvod.spider.merge.p029c0.AbstractC0440N m613i() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.b0.Q r0 = r4.f864a
            r0.m793h()
            com.github.catvod.spider.merge.b0.Q r0 = r4.f864a
            java.lang.String[] r1 = com.github.catvod.spider.merge.p029c0.C0443Q.f860d
            boolean r0 = r0.m789l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.c0.N> r0 = r4.f866c
            com.github.catvod.spider.merge.c0.Z r1 = new com.github.catvod.spider.merge.c0.Z
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.m616f()
        L1f:
            com.github.catvod.spider.merge.b0.Q r1 = r0.f864a
            boolean r1 = r1.m792i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.b0.Q r1 = r0.f864a
            boolean r1 = r1.m793h()
            com.github.catvod.spider.merge.b0.Q r2 = r0.f864a
            java.lang.String[] r3 = com.github.catvod.spider.merge.p029c0.C0443Q.f860d
            boolean r2 = r2.m789l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.b0.Q r1 = r0.f864a
            char r1 = r1.m798c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.m621a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.c0.N> r1 = r0.f866c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.c0.N> r0 = r0.f866c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.c0.N r0 = (com.github.catvod.spider.merge.p029c0.AbstractC0440N) r0
            return r0
        L59:
            com.github.catvod.spider.merge.c0.d r1 = new com.github.catvod.spider.merge.c0.d
            java.util.List<com.github.catvod.spider.merge.c0.N> r0 = r0.f866c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p029c0.C0443Q.m613i():com.github.catvod.spider.merge.c0.N");
    }

    public final String toString() {
        return this.f865b;
    }
}
