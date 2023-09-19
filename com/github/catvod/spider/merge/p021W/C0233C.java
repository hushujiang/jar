package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.p018S.C0202c;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.github.catvod.spider.merge.W.C */
/* loaded from: classes.dex */
final class C0233C {

    /* renamed from: a */
    private final TimeZone f414a;

    /* renamed from: b */
    private final int f415b;

    /* renamed from: c */
    private final Locale f416c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0233C(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.f414a = timeZone;
        if (z) {
            this.f415b = Integer.MIN_VALUE | i;
        } else {
            this.f415b = i;
        }
        this.f416c = C0202c.m1177a(locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0233C) {
            C0233C c0233c = (C0233C) obj;
            return this.f414a.equals(c0233c.f414a) && this.f415b == c0233c.f415b && this.f416c.equals(c0233c.f416c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f416c.hashCode();
        return this.f414a.hashCode() + ((hashCode + (this.f415b * 31)) * 31);
    }
}
