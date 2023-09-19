package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.N.I */
/* loaded from: classes.dex */
public final class C0074I implements InterfaceC0073H {

    /* renamed from: d */
    private static final String[] f113d;

    /* renamed from: e */
    public static final C0074I f114e;

    /* renamed from: a */
    private final String[] f115a;

    /* renamed from: b */
    private final String[] f116b;

    /* renamed from: c */
    private final String[] f117c;

    static {
        String[] strArr = new String[0];
        f113d = strArr;
        f114e = new C0074I(strArr, strArr, strArr);
    }

    public C0074I(String[] strArr, String[] strArr2, String[] strArr3) {
        this.f115a = strArr;
        this.f116b = strArr2;
        strArr3 = strArr3 == null ? f113d : strArr3;
        this.f117c = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* renamed from: a */
    public final String m1388a(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.f117c;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String m1387b = m1387b(i);
        if (m1387b != null) {
            return m1387b;
        }
        String m1386c = m1386c(i);
        return m1386c != null ? m1386c : Integer.toString(i);
    }

    /* renamed from: b */
    public final String m1387b(int i) {
        if (i >= 0) {
            String[] strArr = this.f115a;
            if (i < strArr.length) {
                return strArr[i];
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    public final String m1386c(int i) {
        if (i >= 0) {
            String[] strArr = this.f116b;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return atm.m897d("2F353C");
        }
        return null;
    }
}
