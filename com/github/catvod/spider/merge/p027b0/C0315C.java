package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.b0.C */
/* loaded from: classes.dex */
public final class C0315C {

    /* renamed from: a */
    private String f661a;

    /* renamed from: b */
    private String f662b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0315C(C0362a c0362a, String str) {
        c0362a.getClass();
        this.f661a = c0362a.m724v();
        this.f662b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0315C(C0362a c0362a, String str, Object... objArr) {
        c0362a.getClass();
        this.f661a = c0362a.m724v();
        this.f662b = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("56"));
        m635a.append(this.f661a);
        m635a.append(atm.m897d("54405A"));
        m635a.append(this.f662b);
        return m635a.toString();
    }
}
