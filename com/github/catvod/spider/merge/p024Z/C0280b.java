package com.github.catvod.spider.merge.p024Z;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.Z.b */
/* loaded from: classes.dex */
public final class C0280b {

    /* renamed from: a */
    static final String[] f504a = {"", atm.m897d("4A"), atm.m897d("4A5A"), atm.m897d("4A5A5A"), atm.m897d("4A5A5A55"), atm.m897d("4A5A5A556C"), atm.m897d("4A5A5A556C78"), atm.m897d("4A5A5A556C784A"), atm.m897d("4A5A5A556C784A5A"), atm.m897d("4A5A5A556C784A5A5A"), atm.m897d("4A5A5A556C784A5A5A55"), atm.m897d("4A5A5A556C784A5A5A556C"), atm.m897d("4A5A5A556C784A5A5A556C78"), atm.m897d("4A5A5A556C784A5A5A556C784A"), atm.m897d("4A5A5A556C784A5A5A556C784A5A"), atm.m897d("4A5A5A556C784A5A5A556C784A5A5A"), atm.m897d("4A5A5A556C784A5A5A556C784A5A5A55"), atm.m897d("4A5A5A556C784A5A5A556C784A5A5A556C"), atm.m897d("4A5A5A556C784A5A5A556C784A5A5A556C78"), atm.m897d("4A5A5A556C784A5A5A556C784A5A5A556C784A"), atm.m897d("4A5A5A556C784A5A5A556C784A5A5A556C784A5A")};

    /* renamed from: b */
    private static final Pattern f505b = Pattern.compile(atm.m897d("3455525D1076114B56473177435153"));

    /* renamed from: c */
    private static final Pattern f506c = Pattern.compile(atm.m897d("34211B5836194720272E2D75103B572F7C755351575B117250"));

    /* renamed from: d */
    private static final Pattern f507d = Pattern.compile(atm.m897d("312602457C7536024B131172"));

    /* renamed from: e */
    private static final ThreadLocal<Stack<StringBuilder>> f508e = new C0279a();

    /* renamed from: f */
    public static final /* synthetic */ int f509f = 0;

    /* renamed from: a */
    public static void m1059a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!(codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160)) {
                if (!(codePointAt == 8203 || codePointAt == 173)) {
                    sb.appendCodePoint(codePointAt);
                    z2 = true;
                    z3 = false;
                }
            } else if ((!z || z2) && !z3) {
                sb.append(' ');
                z3 = true;
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: b */
    public static StringBuilder m1058b() {
        Stack<StringBuilder> stack = f508e.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    /* renamed from: c */
    public static boolean m1057c(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* renamed from: d */
    public static boolean m1056d(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m1055e(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m1055e(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* renamed from: f */
    public static String m1054f(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder m1058b = m1058b();
        C0277c.m1063l(m1058b);
        Object obj2 = obj;
        while (true) {
            m1058b.append(obj2);
            if (it.hasNext()) {
                Object next = it.next();
                m1058b.append(str);
                obj2 = next;
            } else {
                return m1052h(m1058b);
            }
        }
    }

    /* renamed from: g */
    public static String m1053g(int i, int i2) {
        C0277c.m1066i(i >= 0, atm.m897d("1D131E012478070F09016C3A0F5A44486C68"));
        C0277c.m1067h(i2 >= -1);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = f504a;
        if (i < 21) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* renamed from: h */
    public static String m1052h(StringBuilder sb) {
        C0277c.m1063l(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f508e.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    /* renamed from: i */
    public static String m1051i(String str, String str2) {
        String m1049k = m1049k(str);
        String m1049k2 = m1049k(str2);
        try {
            try {
                return m1050j(new URL(m1049k), m1049k2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(m1049k2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f506c.matcher(m1049k2).find() ? m1049k2 : "";
        }
    }

    /* renamed from: j */
    public static URL m1050j(URL url, String str) {
        String m1049k = m1049k(str);
        if (m1049k.startsWith(atm.m897d("55"))) {
            m1049k = url.getPath() + m1049k;
        }
        URL url2 = new URL(url, m1049k);
        String replaceFirst = f505b.matcher(url2.getFile()).replaceFirst(atm.m897d("45"));
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + atm.m897d("49") + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }

    /* renamed from: k */
    private static String m1049k(String str) {
        return f507d.matcher(str).replaceAll("");
    }
}
