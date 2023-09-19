package com.github.catvod.spider.merge.p064z;

import com.github.catvod.spider.merge.atm;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.z.c */
/* loaded from: classes.dex */
public enum EnumC0753c {
    /* JADX INFO: Fake field, exist only in values array */
    EF17(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF44(new int[]{1, 3}, atm.m897d("2329355874605F435744")),
    /* JADX INFO: Fake field, exist only in values array */
    EF66(4, atm.m897d("2329355874605F435747")),
    /* JADX INFO: Fake field, exist only in values array */
    EF89(5, atm.m897d("2329355874605F435746")),
    /* JADX INFO: Fake field, exist only in values array */
    EF111(6, atm.m897d("2329355874605F435741")),
    /* JADX INFO: Fake field, exist only in values array */
    EF133(7, atm.m897d("2329355874605F435740")),
    /* JADX INFO: Fake field, exist only in values array */
    EF156(8, atm.m897d("2329355874605F435743")),
    /* JADX INFO: Fake field, exist only in values array */
    EF179(9, atm.m897d("2329355874605F435742")),
    /* JADX INFO: Fake field, exist only in values array */
    EF202(10, atm.m897d("2329355874605F43574D")),
    /* JADX INFO: Fake field, exist only in values array */
    EF225(11, atm.m897d("2329355874605F43574C")),
    /* JADX INFO: Fake field, exist only in values array */
    EF250(12, atm.m897d("2329355874605F4357447C")),
    /* JADX INFO: Fake field, exist only in values array */
    EF276(13, atm.m897d("2329355874605F4357447D")),
    /* JADX INFO: Fake field, exist only in values array */
    EF305(15, atm.m897d("2329355874605F4357447F")),
    /* JADX INFO: Fake field, exist only in values array */
    EF334(16, atm.m897d("2329355874605F43574478")),
    /* JADX INFO: Fake field, exist only in values array */
    EF363(17, atm.m897d("2329355874605F43574479")),
    /* JADX INFO: Fake field, exist only in values array */
    EF392(18, atm.m897d("2329355874605F4357447A")),
    /* JADX INFO: Fake field, exist only in values array */
    EF421(20, atm.m897d("391213133807203329")),
    /* JADX INFO: Fake field, exist only in values array */
    EF450(21, atm.m897d("1D131411232F19574B477968")),
    /* JADX INFO: Fake field, exist only in values array */
    EF479(22, atm.m897d("1D131411232F19574B477969")),
    /* JADX INFO: Fake field, exist only in values array */
    EF508(23, atm.m897d("1D131411232F19574B47796A")),
    /* JADX INFO: Fake field, exist only in values array */
    EF537(24, atm.m897d("1D131411232F19574B47796E")),
    /* JADX INFO: Fake field, exist only in values array */
    EF575(25, atm.m897d("3F2E3C587D6E283F"), atm.m897d("3F141316233C0F381312")),
    /* JADX INFO: Fake field, exist only in values array */
    EF604(26, atm.m897d("3F2E3C5874")),
    /* JADX INFO: Fake field, exist only in values array */
    EF637(new int[]{27, 170}, atm.m897d("3F2957341F1B2333")),
    /* JADX INFO: Fake field, exist only in values array */
    EF662(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF710(29, atm.m897d("2D3848467D6A"), atm.m897d("2F2F392A0F16"), atm.m897d("2D3831")),
    /* JADX INFO: Fake field, exist only in values array */
    EF740(30, atm.m897d("2F2F3958070A"));
    

    /* renamed from: c */
    private static final Map<Integer, EnumC0753c> f1412c = new HashMap();

    /* renamed from: d */
    private static final Map<String, EnumC0753c> f1413d = new HashMap();

    /* renamed from: a */
    private final int[] f1415a;

    /* renamed from: b */
    private final String[] f1416b;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.z.c>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.z.c>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map<java.lang.Integer, com.github.catvod.spider.merge.z.c>, java.util.HashMap] */
    static {
        EnumC0753c[] values;
        for (EnumC0753c enumC0753c : values()) {
            for (int i : enumC0753c.f1415a) {
                f1412c.put(Integer.valueOf(i), enumC0753c);
            }
            f1413d.put(enumC0753c.name(), enumC0753c);
            for (String str : enumC0753c.f1416b) {
                f1413d.put(str, enumC0753c);
            }
        }
    }

    EnumC0753c(int i, String... strArr) {
        this.f1415a = new int[]{i};
        this.f1416b = strArr;
    }

    EnumC0753c(int[] iArr, String... strArr) {
        this.f1415a = iArr;
        this.f1416b = strArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.z.c>, java.util.HashMap] */
    /* renamed from: a */
    public static EnumC0753c m1a(String str) {
        return (EnumC0753c) f1413d.get(str);
    }

    /* renamed from: b */
    public final int m0b() {
        return this.f1415a[0];
    }
}
