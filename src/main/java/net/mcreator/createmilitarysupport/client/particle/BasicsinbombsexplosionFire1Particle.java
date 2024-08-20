
package net.mcreator.createmilitarysupport.client.particle;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

import net.mcreator.createmilitarysupport.procedures.BasicsinbombsexplosionFire1ParticleVisualScaleProcedure;

@OnlyIn(Dist.CLIENT)
public class BasicsinbombsexplosionFire1Particle extends TextureSheetParticle {
	public static BasicsinbombsexplosionFire1ParticleProvider provider(SpriteSet spriteSet) {
		return new BasicsinbombsexplosionFire1ParticleProvider(spriteSet);
	}

	public static class BasicsinbombsexplosionFire1ParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public BasicsinbombsexplosionFire1ParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new BasicsinbombsexplosionFire1Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected BasicsinbombsexplosionFire1Particle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.lifetime = (int) Math.max(1, 200 + (this.random.nextInt(400) - 200));
		this.gravity = 0f;
		this.hasPhysics = true;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public float getQuadSize(float scale) {
		Level world = this.level;
		return super.getQuadSize(scale) * (float) BasicsinbombsexplosionFire1ParticleVisualScaleProcedure.execute();
	}

	@Override
	public void tick() {
		super.tick();
	}
}
