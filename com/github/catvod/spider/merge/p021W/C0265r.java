package com.github.catvod.spider.merge.p021W;

import java.util.TimeZone;

/* renamed from: com.github.catvod.spider.merge.W.r */
/* loaded from: classes.dex */
final class C0265r {

    /* renamed from: a */
    final TimeZone f465a;

    /* renamed from: b */
    final int f466b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0265r(TimeZone timeZone, boolean z) {
        this.f465a = timeZone;
        this.f466b = z ? timeZone.getDSTSavings() : 0;
    }
}
