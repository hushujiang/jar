package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.github.catvod.spider.merge.W.Q */
/* loaded from: classes.dex */
final class C0247Q extends TimeZone {

    /* renamed from: a */
    private final int f444a;

    /* renamed from: b */
    private final String f445b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0247Q(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + atm.m897d("4A1215003E2B4A150F016C370C5A0814223F0F"));
        } else if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + atm.m897d("4A17131B392C0F095A1A392C4A151C553E39041D1F"));
        } else {
            int i3 = ((i * 60) + i2) * 60000;
            this.f444a = z ? -i3 : i3;
            StringBuilder sb = new StringBuilder(9);
            sb.append(atm.m897d("2D372E"));
            sb.append(z ? '-' : '+');
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
            sb.append(':');
            sb.append((char) ((i2 / 10) + 48));
            sb.append((char) ((i2 % 10) + 48));
            this.f445b = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0247Q) && this.f445b == ((C0247Q) obj).f445b;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.f445b;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f444a;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.f444a;
    }

    public final int hashCode() {
        return this.f444a;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("313D17011831071F201A223D4A131E486E"));
        m635a.append(this.f445b);
        m635a.append(atm.m897d("485615132A2B0F0E47"));
        m635a.append(this.f444a);
        m635a.append(']');
        return m635a.toString();
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
