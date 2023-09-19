package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p027b0.C0362a;
import java.io.StringReader;
import java.util.HashMap;

/* renamed from: com.github.catvod.spider.merge.a0.o */
/* loaded from: classes.dex */
public final class C0295o {

    /* renamed from: a */
    private static final char[] f551a = {',', ';'};

    /* renamed from: b */
    private static final HashMap<String, String> f552b = new HashMap<>();

    static {
        new C0287g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m947a(EnumC0294n enumC0294n, String str, int i) {
        int i2;
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        enumC0294n.f547a = new String[i];
        enumC0294n.f548b = new int[i];
        enumC0294n.f549c = new int[i];
        enumC0294n.f550d = new String[i];
        C0362a c0362a = new C0362a(new StringReader(str), str.length());
        int i3 = 0;
        while (!c0362a.m723w()) {
            try {
                String m730p = c0362a.m730p('=');
                c0362a.m745a();
                int parseInt = Integer.parseInt(c0362a.m729q(f551a), 36);
                char m725u = c0362a.m725u();
                c0362a.m745a();
                if (m725u == ',') {
                    i2 = Integer.parseInt(c0362a.m730p(';'), 36);
                    c0362a.m745a();
                } else {
                    i2 = -1;
                }
                int parseInt2 = Integer.parseInt(c0362a.m730p('&'), 36);
                c0362a.m745a();
                strArr = enumC0294n.f547a;
                strArr[i3] = m730p;
                iArr = enumC0294n.f548b;
                iArr[i3] = parseInt;
                iArr2 = enumC0294n.f549c;
                iArr2[parseInt2] = parseInt;
                strArr2 = enumC0294n.f550d;
                strArr2[parseInt2] = m730p;
                if (i2 != -1) {
                    f552b.put(m730p, new String(new int[]{parseInt, i2}, 0, 2));
                }
                i3++;
            } finally {
                c0362a.m742d();
            }
        }
        C0277c.m1066i(i3 == i, atm.m897d("3F141F0D3C3D090E1F116C3B050F14016C370C5A1F1B38311E131F066C34051B1E1028"));
    }

    /* renamed from: b */
    private static void m946b(Appendable appendable, EnumC0294n enumC0294n, int i) {
        Appendable append;
        String m948j = enumC0294n.m948j(i);
        if ("".equals(m948j)) {
            append = appendable.append(atm.m897d("4C5902"));
            m948j = Integer.toHexString(i);
        } else {
            append = appendable.append('&');
        }
        append.append(m948j).append(';');
    }

    /* renamed from: c */
    public static int m945c(String str, int[] iArr) {
        String str2 = f552b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int m949i = EnumC0294n.f545g.m949i(str);
        if (m949i != -1) {
            iArr[0] = m949i;
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
        if (r14 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
        if (r2.canEncode(r6) != false) goto L53;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m944d(java.lang.Appendable r16, java.lang.String r17, com.github.catvod.spider.merge.p025a0.C0287g r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p025a0.C0295o.m944d(java.lang.Appendable, java.lang.String, com.github.catvod.spider.merge.a0.g, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: e */
    public static boolean m943e(String str) {
        return EnumC0294n.f544f.m949i(str) != -1;
    }

    /* renamed from: f */
    public static boolean m942f(String str) {
        return EnumC0294n.f545g.m949i(str) != -1;
    }
}
