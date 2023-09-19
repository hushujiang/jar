package com.github.catvod.spider.merge.p023Y;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p047l0.InterfaceC0614a;
import com.github.catvod.spider.merge.p047l0.InterfaceC0615b;
import com.github.catvod.spider.merge.p051n0.C0633b;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.Y.c */
/* loaded from: classes.dex */
public final class C0277c implements InterfaceC0614a {
    /* renamed from: b */
    public static String m1073b(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return matcher.find() ? matcher.group(0) : "";
    }

    /* renamed from: c */
    public static String m1072c(String str, Charset charset) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance(C0052e.m1418a(new byte[]{82, -100, 42}, new byte[]{31, -40, 31, -84, -116, 65, 110, 4})).digest(str.getBytes(charset))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, C0052e.m1418a(new byte[]{12}, new byte[]{60, -85, -32, -42, -91, -93, -89, -8}));
            }
            return sb.toString().toLowerCase();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static void m1071d(String str) {
        throw new C0278d(str);
    }

    /* renamed from: e */
    public static C0459g m1070e(C0293m c0293m) {
        C0459g c0459g = new C0459g();
        while (true) {
            c0293m = c0293m.m975h0();
            if (c0293m == null) {
                break;
            }
            c0459g.add(c0293m);
        }
        if (c0459g.size() > 0) {
            return c0459g;
        }
        return null;
    }

    /* renamed from: f */
    public static int m1069f(C0293m c0293m, C0524e c0524e) {
        Iterator<C0293m> it = c0293m.m971l0().m986V().iterator();
        int i = 1;
        while (it.hasNext()) {
            C0293m next = it.next();
            if (c0293m.m962u0().equals(next.m962u0()) && c0524e.m462a().contains(next)) {
                if (c0293m == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m1068g(boolean z) {
        if (z) {
            throw new C0278d(atm.m897d("270F09016C3A0F5A1C14202B0F"));
        }
    }

    /* renamed from: h */
    public static void m1067h(boolean z) {
        if (!z) {
            throw new C0278d(atm.m897d("270F09016C3A0F5A0E07393D"));
        }
    }

    /* renamed from: i */
    public static void m1066i(boolean z, String str) {
        if (!z) {
            throw new C0278d(str);
        }
    }

    /* renamed from: j */
    public static void m1065j(String str) {
        if (str == null || str.length() == 0) {
            throw new C0278d(atm.m897d("390E081C223F4A170F06387804150E552E3D4A1F17053821"));
        }
    }

    /* renamed from: k */
    public static void m1064k(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C0278d(str2);
        }
    }

    /* renamed from: l */
    public static void m1063l(Object obj) {
        if (obj == null) {
            throw new C0278d(atm.m897d("251810102F2C4A170F06387804150E552E3D4A140F1920"));
        }
    }

    /* renamed from: m */
    public static C0459g m1062m(C0293m c0293m) {
        C0459g c0459g = new C0459g();
        while (true) {
            c0293m = c0293m.m968o0();
            if (c0293m == null) {
                break;
            }
            c0459g.add(c0293m);
        }
        if (c0459g.size() > 0) {
            return c0459g;
        }
        return null;
    }

    /* renamed from: n */
    public static void m1061n(C0293m c0293m, int i) {
        c0293m.mo926c(atm.m897d("2F3625260D152F252E340B0723343E3014"), String.valueOf(i));
    }

    /* renamed from: o */
    public static void m1060o(C0293m c0293m, int i) {
        c0293m.mo926c(atm.m897d("2F3625260D152F252E340B072B36362A020D27"), String.valueOf(i));
    }

    @Override // com.github.catvod.spider.merge.p047l0.InterfaceC0614a
    /* renamed from: a */
    public InterfaceC0615b mo168a(String str) {
        return C0633b.f1210a;
    }
}
