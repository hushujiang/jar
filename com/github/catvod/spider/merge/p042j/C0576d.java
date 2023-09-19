package com.github.catvod.spider.merge.p042j;

import android.text.TextUtils;

/* renamed from: com.github.catvod.spider.merge.j.d */
/* loaded from: classes.dex */
public final class C0576d {

    /* renamed from: a */
    private final int f1050a;

    /* renamed from: b */
    private final String f1051b;

    public C0576d() {
        this.f1050a = 500;
        this.f1051b = "";
    }

    public C0576d(int i, String str) {
        this.f1050a = i;
        this.f1051b = str;
    }

    /* renamed from: a */
    public final String m302a() {
        return TextUtils.isEmpty(this.f1051b) ? "" : this.f1051b;
    }

    /* renamed from: b */
    public final int m301b() {
        return this.f1050a;
    }
}
