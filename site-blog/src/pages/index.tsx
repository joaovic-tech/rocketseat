import { HeroSection } from "@/components/hero-section";
import { FeatureSection } from "@/components/feature-section";
import {SupportSection} from "@/components/support-section";

export default function Home() {
  return (
    <article className="flex-col">
      <HeroSection />
      <FeatureSection />
      <SupportSection />
    </article>
  );
}
