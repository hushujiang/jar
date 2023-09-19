package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.p018S.C0202c;
import com.github.catvod.spider.merge.p018S.C0209j;
import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.github.catvod.spider.merge.W.b */
/* loaded from: classes.dex */
final class C0249b {

    /* renamed from: a */
    private final ConcurrentMap<C0246P, C0250c> f447a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.W.P, com.github.catvod.spider.merge.W.c>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentMap<com.github.catvod.spider.merge.W.P, com.github.catvod.spider.merge.W.c>, java.util.concurrent.ConcurrentHashMap] */
    /* renamed from: a */
    public final Format m1098a(String str, Locale locale) {
        C0209j.m1164a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale m1177a = C0202c.m1177a(locale);
        C0246P c0246p = new C0246P(str, timeZone, m1177a);
        Format format = (Format) this.f447a.get(c0246p);
        if (format == null) {
            C0250c c0250c = new C0250c(str, timeZone, m1177a);
            Format format2 = (Format) this.f447a.putIfAbsent(c0246p, c0250c);
            return format2 != null ? format2 : c0250c;
        }
        return format;
    }
}
