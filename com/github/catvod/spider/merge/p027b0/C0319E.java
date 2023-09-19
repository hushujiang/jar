package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.p025a0.C0283c;
import com.github.catvod.spider.merge.p029c0.C0441O;

/* renamed from: com.github.catvod.spider.merge.b0.E */
/* loaded from: classes.dex */
public final class C0319E {

    /* renamed from: c */
    public static final C0319E f664c = new C0319E(false, false);

    /* renamed from: d */
    public static final C0319E f665d = new C0319E(true, true);

    /* renamed from: a */
    private final boolean f666a;

    /* renamed from: b */
    private final boolean f667b;

    public C0319E(boolean z, boolean z2) {
        this.f666a = z;
        this.f667b = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m855a(String str) {
        return C0441O.m624a(str.trim());
    }

    /* renamed from: b */
    public final String m854b(String str) {
        String trim = str.trim();
        return !this.f667b ? C0441O.m624a(trim) : trim;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0283c m853c(C0283c c0283c) {
        if (c0283c != null && !this.f667b) {
            c0283c.m1024u();
        }
        return c0283c;
    }

    /* renamed from: d */
    public final String m852d(String str) {
        String trim = str.trim();
        return !this.f666a ? C0441O.m624a(trim) : trim;
    }

    /* renamed from: e */
    public final boolean m851e() {
        return this.f667b;
    }

    /* renamed from: f */
    public final boolean m850f() {
        return this.f666a;
    }
}
