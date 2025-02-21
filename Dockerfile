# Use official PostgreSQL image
FROM postgres:13.1-alpine

# Set environment variables
ENV POSTGRES_USER=admin
ENV POSTGRES_PASSWORD=admin
ENV POSTGRES_DB=db_device

# Expose PostgreSQL port
EXPOSE 5432

# Default command to run PostgreSQL
CMD ["postgres"]
